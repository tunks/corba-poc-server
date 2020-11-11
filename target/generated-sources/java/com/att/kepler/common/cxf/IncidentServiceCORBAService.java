package com.att.kepler.common.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-11T14:22:10.950-05:00
 * Generated source version: 3.4.0
 *
 */
@WebServiceClient(name = "IncidentServiceCORBAService",
                  wsdlLocation = "file:/Users/et623d/development/projects/corba-poc-server/src/main/resources/wsdl/IncidentWS.wsdl",
                  targetNamespace = "http://cxf.apache.org/bindings/corba/idl/IncidentWS")
public class IncidentServiceCORBAService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cxf.apache.org/bindings/corba/idl/IncidentWS", "IncidentServiceCORBAService");
    public final static QName IncidentServiceCORBAPort = new QName("http://cxf.apache.org/bindings/corba/idl/IncidentWS", "IncidentServiceCORBAPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/et623d/development/projects/corba-poc-server/src/main/resources/wsdl/IncidentWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IncidentServiceCORBAService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/et623d/development/projects/corba-poc-server/src/main/resources/wsdl/IncidentWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IncidentServiceCORBAService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IncidentServiceCORBAService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IncidentServiceCORBAService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public IncidentServiceCORBAService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IncidentServiceCORBAService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IncidentServiceCORBAService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IncidentService
     */
    @WebEndpoint(name = "IncidentServiceCORBAPort")
    public IncidentService getIncidentServiceCORBAPort() {
        return super.getPort(IncidentServiceCORBAPort, IncidentService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IncidentService
     */
    @WebEndpoint(name = "IncidentServiceCORBAPort")
    public IncidentService getIncidentServiceCORBAPort(WebServiceFeature... features) {
        return super.getPort(IncidentServiceCORBAPort, IncidentService.class, features);
    }

}