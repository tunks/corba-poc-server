
package com.att.kepler.corba.client;

import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.UserException;
import com.att.kepler.common.corba.Incident;
import com.att.kepler.common.corba.IncidentService;
import com.att.kepler.common.corba.IncidentServiceHelper;
/**
 * 
 * CORBA test client to create incidents
 * 
 * @author et623d
 **/
public final class Client {
    private Client() {}
    static int run(ORB orb, String[] args) throws UserException {

        // Get the Bank object
        org.omg.CORBA.Object obj =
            orb.string_to_object("corbaname::localhost:1050#IncidentWS");
        if (obj == null) {
            System.err.println("IncidentService.Client: cannot read IOR from corbaname::localhost:1050#IncidentWS");
            return 1;
        }
        IncidentService incidentService = IncidentServiceHelper.narrow(obj);

        // Test the method IncidentService.create_incident()
        System.out.println("Creating incident called \"Incident1\"");
        Incident incident1 = incidentService.create_incident("Incident1");
        System.out.println("Current incident status of \"Incident1\" is " + incident1.status);
        System.out.println("Current incident created_timestamp of \"Incident1\" is " + incident1.created_timestamp);

        System.out.println("********************************");

        // Test the method Bank.create_epr_account()
        System.out.println("Creating incident called \"Incident2\"");
        Incident incident2 = incidentService.create_incident("Incident2");
        System.out.println("Current incident status of \"Incident2\" is " + incident2.status);
        System.out.println("Current incident created_timestamp of \"Incident2\" is " + incident2.created_timestamp);
        System.out.println("***********************************");
       
        incidentService.remove_incident("Incident1");
        System.out.println("Removed  \"Incident1\"");


        return 0;
    }

    public static void main(String[] args) {
        int status = 0;
        ORB orb = null;

        Properties props = System.getProperties();

        try {
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
