
package io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02 package. 
 * <p>An ObjectFactory allows you to programatically 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComponentRepairType }
     * 
     */
    public ComponentRepairType createComponentRepairType() {
        return new ComponentRepairType();
    }

    /**
     * Create an instance of {@link ComponentRepairA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ComponentRepairA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ComponentRepair:xsd:codelist:01.02", name = "ComponentRepairA")
    public ComponentRepairA createComponentRepairA(Object value) {
        return new ComponentRepairA(value);
    }

    /**
     * Create an instance of {@link ComponentRepair }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ComponentRepair }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ComponentRepair:xsd:codelist:01.02", name = "ComponentRepair", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:ComponentRepair:xsd:codelist:01.02", substitutionHeadName = "ComponentRepairA")
    public ComponentRepair createComponentRepair(ComponentRepairType value) {
        return new ComponentRepair(value);
    }

}
