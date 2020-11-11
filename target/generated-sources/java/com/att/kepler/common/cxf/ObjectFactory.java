
package com.att.kepler.common.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import javax.xml.ws.wsaddressing.W3CEndpointReference;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.att.kepler.common.cxf package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IncidentRef_QNAME = new QName("http://cxf.apache.org/bindings/corba/idl/IncidentWS", "IncidentRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.att.kepler.common.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIncidentId }
     * 
     */
    public GetIncidentId createGetIncidentId() {
        return new GetIncidentId();
    }

    /**
     * Create an instance of {@link GetIncidentIdResponse }
     * 
     */
    public GetIncidentIdResponse createGetIncidentIdResponse() {
        return new GetIncidentIdResponse();
    }

    /**
     * Create an instance of {@link SetIncidentId }
     * 
     */
    public SetIncidentId createSetIncidentId() {
        return new SetIncidentId();
    }

    /**
     * Create an instance of {@link SetIncidentIdResponse }
     * 
     */
    public SetIncidentIdResponse createSetIncidentIdResponse() {
        return new SetIncidentIdResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link SetStatus }
     * 
     */
    public SetStatus createSetStatus() {
        return new SetStatus();
    }

    /**
     * Create an instance of {@link SetStatusResponse }
     * 
     */
    public SetStatusResponse createSetStatusResponse() {
        return new SetStatusResponse();
    }

    /**
     * Create an instance of {@link GetCreatedTimestamp }
     * 
     */
    public GetCreatedTimestamp createGetCreatedTimestamp() {
        return new GetCreatedTimestamp();
    }

    /**
     * Create an instance of {@link GetCreatedTimestampResponse }
     * 
     */
    public GetCreatedTimestampResponse createGetCreatedTimestampResponse() {
        return new GetCreatedTimestampResponse();
    }

    /**
     * Create an instance of {@link SetCreatedTimestamp }
     * 
     */
    public SetCreatedTimestamp createSetCreatedTimestamp() {
        return new SetCreatedTimestamp();
    }

    /**
     * Create an instance of {@link SetCreatedTimestampResponse }
     * 
     */
    public SetCreatedTimestampResponse createSetCreatedTimestampResponse() {
        return new SetCreatedTimestampResponse();
    }

    /**
     * Create an instance of {@link CreateIncident }
     * 
     */
    public CreateIncident createCreateIncident() {
        return new CreateIncident();
    }

    /**
     * Create an instance of {@link CreateIncidentResponse }
     * 
     */
    public CreateIncidentResponse createCreateIncidentResponse() {
        return new CreateIncidentResponse();
    }

    /**
     * Create an instance of {@link FindIncident }
     * 
     */
    public FindIncident createFindIncident() {
        return new FindIncident();
    }

    /**
     * Create an instance of {@link FindIncidentResponse }
     * 
     */
    public FindIncidentResponse createFindIncidentResponse() {
        return new FindIncidentResponse();
    }

    /**
     * Create an instance of {@link RemoveIncident }
     * 
     */
    public RemoveIncident createRemoveIncident() {
        return new RemoveIncident();
    }

    /**
     * Create an instance of {@link RemoveIncidentResponse }
     * 
     */
    public RemoveIncidentResponse createRemoveIncidentResponse() {
        return new RemoveIncidentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/bindings/corba/idl/IncidentWS", name = "IncidentRef")
    public JAXBElement<W3CEndpointReference> createIncidentRef(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_IncidentRef_QNAME, W3CEndpointReference.class, null, value);
    }

}
