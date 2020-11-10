package com.att.kepler.server;

import org.omg.PortableServer.POA;

import corba.common.IncidentPOA;

public class IncidentImpl extends IncidentPOA {
	private String incidentId;
	private String status;
	private String createdTimestamp;

	// The servants default POA
	private POA poa_;

	public IncidentImpl(POA poa_) {
		this.poa_ = poa_;
	}

	
	public POA _default_POA() {
		return poa_;
	}


	@Override
	public String get_incident_id() {
		return this.incidentId;
	}


	@Override
	public void set_incident_id(String incident_id) {
		this.incidentId = incident_id;		
	}


	@Override
	public String get_status() {
		return this.status;
	}


	@Override
	public void set_status(String status) {
       this.status = status;		
	}


	@Override
	public String get_created_timestamp() {
		return this.createdTimestamp;
	}


	@Override
	public void set_created_timestamp(String created_timestamp) {
        this.createdTimestamp = created_timestamp;		
	}

}
