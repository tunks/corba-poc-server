package com.att.kepler.corba.server;

import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.portable.UnknownException;
import org.omg.PortableServer.POA;

import com.att.kepler.common.corba.Incident;
import com.att.kepler.common.corba.IncidentHelper;
import com.att.kepler.common.corba.IncidentServicePOA;




public class IncidentServiceImpl extends IncidentServicePOA {
	// The servants default POA
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

		System.out.println("[IncidentService] Called create_incident( " + incident_id + " )...");
		IncidentImpl accountImpl = new IncidentImpl(poa_);
		String name = incident_id;
		byte[] oid = name.getBytes();
		try {
			poa_.activate_object_with_id(oid, accountImpl);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			org.omg.CORBA.Object obj = poa_.create_reference_with_id(oid, IncidentHelper.id());
			Incident incident = IncidentHelper.narrow(obj);

			incident.set_incident_id(incident_id);
			incident.set_status("CREATED");
			incident.set_created_timestamp(String.valueOf(System.currentTimeMillis()));
			incidentStore.put(incident_id, incident);
			System.out.println("[IncidentService] Created create_incident( " + incident_id + " )...");
			return incident;
		} catch (final Throwable ex) {
			ex.printStackTrace();
			throw new UnknownException(ex);
		}
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
