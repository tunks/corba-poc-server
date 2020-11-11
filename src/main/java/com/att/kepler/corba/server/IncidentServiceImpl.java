package com.att.kepler.corba.server;

import java.util.HashMap;
import java.util.Map;
import org.omg.PortableServer.POA;
import com.att.kepler.common.corba.Incident;
import com.att.kepler.common.corba.IncidentServicePOA;

public class IncidentServiceImpl extends IncidentServicePOA {
	private POA poa_;
	private Map<String, Incident> incidentStore;

	public IncidentServiceImpl(POA poa_) {
		this.poa_ = poa_;
		incidentStore = new HashMap<String, Incident>();
	}

	@Override
	public Incident create_incident(String incident_id) {
		if (incidentStore.containsKey(incident_id)) {
			return incidentStore.get(incident_id);
		}
		String createdTimestamp = String.valueOf(System.currentTimeMillis());
        Incident incident = new Incident(incident_id,"CREATED", createdTimestamp);
		System.out.println("[IncidentService] Called create_incident( " + incident_id + " )...");
		return  incident;
	}

	@Override
	public Incident find_incident(String incident_id) {
		System.out.println("[IncidentService] Called get_account( " + incident_id + ")...");
		System.out.println();
		return incidentStore.get(incident_id);
	}

	@Override
	public void remove_incident(String incident_id) {
		System.out.println("[IncidentService] Called remove_account( " + incident_id + ")...");
		System.out.println();
		incidentStore.remove(incident_id);
	}

	public POA _default_POA() {
		return poa_;
	}
}
