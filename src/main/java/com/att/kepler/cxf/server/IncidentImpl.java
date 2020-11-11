package com.att.kepler.cxf.server;

import com.att.kepler.common.cxf.Incident;

@javax.jws.WebService(portName = "IncidentCORBAPort",
					  serviceName = "IncidentCORBAService",
					  targetNamespace = "http://cxf.apache.org/bindings/corba/idl/IncidentWS",
					  wsdlLocation = "classpath:/wsdl/IncidentWS.wsdl",
					  endpointInterface = "com.att.kepler.common.cxf.Incident")
public class IncidentImpl implements Incident{
	private String incidentId = "";
	private String status  = "";
	private String createdTimestamp = "";
	
	@Override
	public String getIncidentId() {
		return incidentId;
	}

	@Override
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	@Override
	public void setStatus(String status) {
       this.status = status;		
	}

	@Override
	public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;		
	}

}
