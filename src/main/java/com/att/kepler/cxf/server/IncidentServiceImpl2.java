package com.att.kepler.cxf.server;

import javax.xml.ws.Endpoint;
import javax.xml.ws.wsaddressing.W3CEndpointReference;
import com.att.kepler.common.cxf.IncidentService;
import com.att.kepler.common.cxf.IncidentServiceCORBAService;

@javax.jws.WebService(portName = "IncidentServiceCORBAPort",
					  serviceName = "IncidentServiceCORBAService",
					  targetNamespace = "http://cxf.apache.org/bindings/corba/idl/IncidentWS",
					  wsdlLocation = "classpath:/wsdl/IncidentWS.wsdl",
					  endpointInterface = "com.att.kepler.common.cxf.IncidentService")
public class IncidentServiceImpl2{
	IncidentServiceCORBAService service = new IncidentServiceCORBAService();
	
	public W3CEndpointReference createIncident(String incidentId) {
		// -Dhttp.proxyHost=sub.proxy.att.com -Dhttp.proxyPort=8080 -Dhttps.proxyHost=sub.proxy.att.com -Dhttps.proxyPort=8080 -Pcxf.server -Dhttp.proxyHost=sub.proxy.att.com -Dhttp.proxyPort=8080 -Dhttps.proxyHost=sub.proxy.att.com -Dhttps.proxyPort=8080 -Pcxf.server
		
		//return service.getIncidentServiceCORBAPort().createIncident(incidentId);
		return service.getIncidentServiceCORBAPort().createIncident(incidentId);
	}

	public void removeIncident(String incidentId) {
		
	}


	public W3CEndpointReference findIncident(String incidentId) {
		return createIncidentReference(incidentId);
	}

    private W3CEndpointReference createIncidentReference(String incidentId) {
        String corbaAddress = "corbaname::localhost:1050#IncidentWS" + incidentId;
        Object account = new IncidentImpl();
        Endpoint ep = Endpoint.publish(corbaAddress, account);
        System.out.println("Created incident reference");
        
        return (W3CEndpointReference)ep.getEndpointReference((org.w3c.dom.Element[])null);
    }
}
