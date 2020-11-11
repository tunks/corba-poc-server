package com.att.kepler.corba.server;

import java.util.Properties;

import org.omg.CORBA.ORB;
import org.omg.CORBA.UserException;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManager;
import com.att.kepler.common.corba.IncidentServiceHelper;


public final class Server {
    private Server() {}

    static int run(ORB orb, String[] args) throws UserException {
        //
        // Resolve Root POA
        //
        POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        //
        // Get a reference to the POA manager
        //
        POAManager manager = poa.the_POAManager();

        //
        // Create implementation object
        //
        IncidentServiceImpl incidentService = new IncidentServiceImpl(poa);

        byte[] oid = "IncidentWS".getBytes();
        poa.activate_object_with_id(oid, incidentService);

        org.omg.CORBA.Object ref = poa.create_reference_with_id(oid, IncidentServiceHelper.id());

        // Register in NameService
        org.omg.CORBA.Object nsObj = orb.resolve_initial_references("NameService");
        NamingContextExt rootContext = NamingContextExtHelper.narrow(nsObj);
        NameComponent[] nc = rootContext.to_name("IncidentWS");
        rootContext.rebind(nc, ref);

        //
        // Run implementation
        //
        manager.activate();
        System.out.println("Server ready...");
        orb.run();

        return 0;
    }

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.put("org.omg.CORBA.ORBInitialHost", "localhost");
        props.put("org.omg.CORBA.ORBInitialPort", "1050");

        int status = 0;
        ORB orb = null;
        try         {
            orb = ORB.init(args, props);
            status = run(orb, args);
        } catch (Exception ex) {
            ex.printStackTrace();
            status = 1;
        }

        if (orb != null) {
            try {
                orb.destroy();
            } catch (Exception ex) {
                ex.printStackTrace();
                status = 1;
            }
        }

        System.exit(status);
    }
}
