package ggt;


/**
* ggt/_ProcessStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Aufabe2.idl
* Mittwoch, 23. April 2014 10:48 Uhr MESZ
*/

public class _ProcessStub extends org.omg.CORBA.portable.ObjectImpl implements ggt.Process
{

  public String name ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_name", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return name (        );
            } finally {
                _releaseReply ($in);
            }
  } // name


  // Methods for the other Processes
  public void getNumber (int number)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getNumber", true);
                $out.write_long (number);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                getNumber (number        );
            } finally {
                _releaseReply ($in);
            }
  } // getNumber

  public void terminate (ggt.Process terminator)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("terminate", true);
                ggt.ProcessHelper.write ($out, terminator);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                terminate (terminator        );
            } finally {
                _releaseReply ($in);
            }
  } // terminate

  public void stop (ggt.Process stopper)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("stop", true);
                ggt.ProcessHelper.write ($out, stopper);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                stop (stopper        );
            } finally {
                _releaseReply ($in);
            }
  } // stop


  //Methods for the Starter
  public void quit (String starterName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("quit", true);
                $out.write_string (starterName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                quit (starterName        );
            } finally {
                _releaseReply ($in);
            }
  } // quit


  //Methods for the Koordinator
  public void init (ggt.Process rightNeighbor, ggt.Process leftNeighbor, int startGGT, int delay, int timeout, monitor.Monitor theMonitor, ggt.Koordinator koor)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("init", true);
                ggt.ProcessHelper.write ($out, rightNeighbor);
                ggt.ProcessHelper.write ($out, leftNeighbor);
                $out.write_long (startGGT);
                $out.write_long (delay);
                $out.write_long (timeout);
                ggt.MonitorHelper.write ($out, theMonitor);
                ggt.KoordinatorHelper.write ($out, koor);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                init (rightNeighbor, leftNeighbor, startGGT, delay, timeout, theMonitor, koor        );
            } finally {
                _releaseReply ($in);
            }
  } // init

  public void startCalulation ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("startCalulation", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                startCalulation (        );
            } finally {
                _releaseReply ($in);
            }
  } // startCalulation

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ggt/Process:1.0"};

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
} // class _ProcessStub
