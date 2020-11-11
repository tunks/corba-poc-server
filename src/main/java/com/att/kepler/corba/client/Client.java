/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.att.kepler.corba.client;

import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.UserException;
import com.att.kepler.common.corba.Incident;
import com.att.kepler.common.corba.IncidentService;
import com.att.kepler.common.corba.IncidentServiceHelper;


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
        System.out.println("Set incident status \"Incident1\"->CONFIRMED");
        System.out.println("Current incident status of \"Incident1\" is " + incident1.get_status());
        System.out.println("Current incident created_timestamp of \"Incident1\" is " + incident1.get_created_timestamp());

        System.out.println("********************************");

        // Test the method Bank.create_epr_account()
        System.out.println("Creating incident called \"Incident2\"");
        Incident incident2 = incidentService.create_incident("Incident2");
        System.out.println("Set incident status \"Incident2\"->CONFIRMED");
        System.out.println("Current incident status of \"Incident2\" is " + incident2.get_status());
        System.out.println("***********************************");

       
        incidentService.remove_incident("Account1");

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
