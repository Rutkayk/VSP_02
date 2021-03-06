package ggt;


/**
* ggt/ProcessPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Aufabe2.idl
* Mittwoch, 23. April 2014 10:48 Uhr MESZ
*/

public abstract class ProcessPOA extends org.omg.PortableServer.Servant
 implements ggt.ProcessOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_name", new java.lang.Integer (0));
    _methods.put ("getNumber", new java.lang.Integer (1));
    _methods.put ("terminate", new java.lang.Integer (2));
    _methods.put ("stop", new java.lang.Integer (3));
    _methods.put ("quit", new java.lang.Integer (4));
    _methods.put ("init", new java.lang.Integer (5));
    _methods.put ("startCalulation", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ggt/Process/_get_name
       {
         String $result = null;
         $result = this.name ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }


  // Methods for the other Processes
       case 1:  // ggt/Process/getNumber
       {
         int number = in.read_long ();
         this.getNumber (number);
         out = $rh.createReply();
         break;
       }

       case 2:  // ggt/Process/terminate
       {
         ggt.Process terminator = ggt.ProcessHelper.read (in);
         this.terminate (terminator);
         out = $rh.createReply();
         break;
       }

       case 3:  // ggt/Process/stop
       {
         ggt.Process stopper = ggt.ProcessHelper.read (in);
         this.stop (stopper);
         out = $rh.createReply();
         break;
       }


  //Methods for the Starter
       case 4:  // ggt/Process/quit
       {
         String starterName = in.read_string ();
         this.quit (starterName);
         out = $rh.createReply();
         break;
       }


  //Methods for the Koordinator
       case 5:  // ggt/Process/init
       {
         ggt.Process rightNeighbor = ggt.ProcessHelper.read (in);
         ggt.Process leftNeighbor = ggt.ProcessHelper.read (in);
         int startGGT = in.read_long ();
         int delay = in.read_long ();
         int timeout = in.read_long ();
         monitor.Monitor theMonitor = ggt.MonitorHelper.read (in);
         ggt.Koordinator koor = ggt.KoordinatorHelper.read (in);
         this.init (rightNeighbor, leftNeighbor, startGGT, delay, timeout, theMonitor, koor);
         out = $rh.createReply();
         break;
       }

       case 6:  // ggt/Process/startCalulation
       {
         this.startCalulation ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ggt/Process:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Process _this() 
  {
    return ProcessHelper.narrow(
    super._this_object());
  }

  public Process _this(org.omg.CORBA.ORB orb) 
  {
    return ProcessHelper.narrow(
    super._this_object(orb));
  }


} // class ProcessPOA
