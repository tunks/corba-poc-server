package corba.common;


/**
* corba/common/IncidentPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/ebrimatunkara/eclipse-workspace/corba-poc-server/src/main/idl/IncidentWS.idl
* Tuesday, November 10, 2020 4:42:40 PM EST
*/


/**
 *
 * @author ebrima
 * Incident IDL poc sample
 */
public class IncidentPOATie extends IncidentPOA
{

  // Constructors

  public IncidentPOATie ( corba.common.IncidentOperations delegate ) {
      this._impl = delegate;
  }
  public IncidentPOATie ( corba.common.IncidentOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public corba.common.IncidentOperations _delegate() {
      return this._impl;
  }
  public void _delegate (corba.common.IncidentOperations delegate ) {
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

  private corba.common.IncidentOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class IncidentPOATie
