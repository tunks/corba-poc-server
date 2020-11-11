package com.att.kepler.cxf.server;

import javax.xml.ws.Endpoint;

/**
 * 
 * CXF/Corba server for creating incidents
 * 
 * @author et623d
 */
public class Server {
    protected Server() throws Exception {
        System.out.println("Starting CXF/Corba Server");

        Object implementor = new IncidentServiceImpl();
        String address = "corbaname::localhost:1050#IncidentWS";
        Endpoint.publish(address, implementor);
    }

    public static void main(String[] args) throws Exception {
		// -Dhttp.proxyHost=sub.proxy.att.com -Dhttp.proxyPort=8080 -Dhttps.proxyHost=sub.proxy.att.com -Dhttps.proxyPort=8080 -Pcxf.server -Dhttp.proxyHost=sub.proxy.att.com -Dhttp.proxyPort=8080 -Dhttps.proxyHost=sub.proxy.att.com -Dhttps.proxyPort=8080 -Pcxf.server

        new Server();
        System.out.println("CXF/Corba Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}