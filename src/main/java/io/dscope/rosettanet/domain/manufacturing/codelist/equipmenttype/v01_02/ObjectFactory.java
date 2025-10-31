
package io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EquipmentTypeType }
     * 
     */
    public EquipmentTypeType createEquipmentTypeType() {
        return new EquipmentTypeType();
    }

    /**
     * Create an instance of {@link EquipmentTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link EquipmentTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02", name = "EquipmentTypeA")
    public EquipmentTypeA createEquipmentTypeA(Object value) {
        return new EquipmentTypeA(value);
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link EquipmentType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02", name = "EquipmentType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02", substitutionHeadName = "EquipmentTypeA")
    public EquipmentType createEquipmentType(EquipmentTypeType value) {
        return new EquipmentType(value);
    }

}
