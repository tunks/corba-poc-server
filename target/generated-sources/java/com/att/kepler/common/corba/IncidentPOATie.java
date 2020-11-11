package com.att.kepler.common.corba;


/**
* com/att/kepler/common/corba/IncidentPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/et623d/development/projects/corba-poc-server/src/main/idl/IncidentWS.idl
* Wednesday, November 11, 2020 2:22:08 PM EST
*/


/**
 *
 * @author ebrima
 * Incident IDL poc sample
 */
public class IncidentPOATie extends IncidentPOA
{

  // Constructors

  public IncidentPOATie ( com.att.kepler.common.corba.IncidentOperations delegate ) {
      this._impl = delegate;
  }
  public IncidentPOATie ( com.att.kepler.common.corba.IncidentOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public com.att.kepler.common.corba.IncidentOperations _delegate() {
      return this._impl;
  }
  public void _delegate (com.att.kepler.common.corba.IncidentOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public String get_incident_id ()
  {
    return _impl.get_incident_id();
  } // get_incident_id

  public void set_incident_id (String incident_id)
  {
    _impl.set_incident_id(incident_id);
  } // set_incident_id

  public String get_status ()
  {
    return _impl.get_status();
  } // get_status

  public void set_status (String status)
  {
    _impl.set_status(status);
  } // set_status

  public String get_created_timestamp ()
  {
    return _impl.get_created_timestamp();
  } // get_created_timestamp

  public void set_created_timestamp (String created_timestamp)
  {
    _impl.set_created_timestamp(created_timestamp);
  } // set_created_timestamp

  private com.att.kepler.common.corba.IncidentOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class IncidentPOATie