
package io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentTermsType }
     * 
     */
    public ShipmentTermsType createShipmentTermsType() {
        return new ShipmentTermsType();
    }

    /**
     * Create an instance of {@link ShipmentTermsA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentTermsA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", name = "ShipmentTermsA")
    public ShipmentTermsA createShipmentTermsA(Object value) {
        return new ShipmentTermsA(value);
    }

    /**
     * Create an instance of {@link ShipmentTerms }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentTerms }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", name = "ShipmentTerms", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", substitutionHeadName = "ShipmentTermsA")
    public ShipmentTerms createShipmentTerms(ShipmentTermsType value) {
        return new ShipmentTerms(value);
    }

}