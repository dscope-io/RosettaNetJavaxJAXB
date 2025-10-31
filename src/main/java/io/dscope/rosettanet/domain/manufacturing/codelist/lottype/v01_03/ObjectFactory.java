
package io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LotTypeType }
     * 
     */
    public LotTypeType createLotTypeType() {
        return new LotTypeType();
    }

    /**
     * Create an instance of {@link LotTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.03", name = "LotTypeA")
    public LotTypeA createLotTypeA(Object value) {
        return new LotTypeA(value);
    }

    /**
     * Create an instance of {@link LotType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.03", name = "LotType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.03", substitutionHeadName = "LotTypeA")
    public LotType createLotType(LotTypeType value) {
        return new LotType(value);
    }

}
