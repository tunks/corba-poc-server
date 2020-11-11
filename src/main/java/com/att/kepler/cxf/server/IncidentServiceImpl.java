package com.att.kepler.cxf.server;
import java.util.HashMap;
import java.util.Map;

import com.att.kepler.common.cxf.Incident;
import com.att.kepler.common.cxf.IncidentService;

/**
 * 
 * CXF/Corba incident service
 * 
 * @author et623d
 */
@javax.jws.WebService(portName = "IncidentServiceCORBAPort",
					  serviceName = "IncidentServiceCORBAService",
					  targetNamespace = "http://cxf.apache.org/bindings/corba/idl/IncidentWS",
					  wsdlLocation = "classpath:/wsdl/IncidentWS.wsdl",
					  endpointInterface = "com.att.kepler.common.cxf.IncidentService")
public class IncidentServiceImpl implements IncidentService{ 
	private Map<String,Incident> incidents = new HashMap<String,Incident>();
	
	@Override
	public Incident createIncident(String incidentId) {
		if(incidents.containsKey(incidentId)) {
		   return findIncident(incidentId);
		}
		String createdTimestamp = String.valueOf(System.currentTimeMillis());
		Incident incident  = new Incident();
		incident.setIncidentId(incidentId);
		incident.setStatus("CREATED");
		incident.setCreatedTimestamp(createdTimestamp);
		incidents.put(incidentId, incident);
		return incident;
	}

	@Override
	public void removeIncident(String incidentId) {
		incidents.remove(incidentId);
	}

	@Override
	public Incident findIncident(String incidentId) {
		return incidents.get(incidentId);
	}
}
