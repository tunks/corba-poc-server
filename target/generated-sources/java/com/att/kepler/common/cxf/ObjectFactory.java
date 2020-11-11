
package com.att.kepler.common.cxf;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.att.kepler.common.cxf
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link Incident }
     * 
     */
    public Incident createIncident() {
        return new Incident();
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

}
