CORBA - Poc Server/Client
======================
A simple server/client program for creating incidents using CORBA/IIOP.  
It program contains standard CORBA client/server applications using 
pure CORBA IDL definition of incident objects.


1. Build using Maven
-----------------------------------------
mvn clean install


2. Run ORB 
---------------------------

Start the orbd service using the JDK Sun ORB built into the JDK, from a command 
prompt, run:

  orbd -ORBInitialPort 1050 -serverPollingTime 200


3. Run CORBA Server and Client
-------------------------------------------------
Start the pure CORBA server by running
  mvn -Pcorba.server

Run the pure CORBA client by running:
  mvn -Pcorba.client
  


4 Generate CORBA IDL to WSDL for CXF JAX-WS(web service) integration
------------------------------------------------------------------
- Download Apache CXF 
- Change directory to src/main/idl 
- Run the idl2wsdl tool to generate IncidentWS.wsdl using the command below:
  apache-cxf-3.4.0/bin/idl2wsdl -a corbaname::localhost:1050#IncidentWS  -qualified  IncidentWS.idl 

