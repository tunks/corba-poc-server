package corba.common;


/**
* corba/common/_IncidentServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/ebrimatunkara/eclipse-workspace/corba-poc-server/src/main/idl/IncidentWS.idl
* Tuesday, November 10, 2020 4:42:40 PM EST
*/

public class _IncidentServiceStub extends org.omg.CORBA.portable.ObjectImpl implements corba.common.IncidentService
{

  public corba.common.Incident create_incident (String incident_id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_incident", true);
                $out.write_string (incident_id);
                $in = _invoke ($out);
                corba.common.Incident $result = corba.common.IncidentHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_incident (incident_id        );
            } finally {
                _releaseReply ($in);
            }
  } // create_incident

  public corba.common.Incident find_incident (String incident_id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("find_incident", true);
                $out.write_string (incident_id);
                $in = _invoke ($out);
                corba.common.Incident $result = corba.common.IncidentHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return find_incident (incident_id        );
            } finally {
                _releaseReply ($in);
            }
  } // find_incident

  public void remove_incident (String incident_id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_incident", true);
                $out.write_string (incident_id);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_incident (incident_id        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_incident

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:IncidentService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _IncidentServiceStub
