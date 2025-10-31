
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaterialCompositionInformationDistributionType }
     * 
     */
    public MaterialCompositionInformationDistributionType createMaterialCompositionInformationDistributionType() {
        return new MaterialCompositionInformationDistributionType();
    }

    /**
     * Create an instance of {@link ConditionType }
     * 
     */
    public ConditionType createConditionType() {
        return new ConditionType();
    }

    /**
     * Create an instance of {@link ProductIdentifierType }
     * 
     */
    public ProductIdentifierType createProductIdentifierType() {
        return new ProductIdentifierType();
    }

    /**
     * Create an instance of {@link ProductInformationType }
     * 
     */
    public ProductInformationType createProductInformationType() {
        return new ProductInformationType();
    }

    /**
     * Create an instance of {@link ProductInformationHeaderType }
     * 
     */
    public ProductInformationHeaderType createProductInformationHeaderType() {
        return new ProductInformationHeaderType();
    }

    /**
     * Create an instance of {@link ProductInformationObjectType }
     * 
     */
    public ProductInformationObjectType createProductInformationObjectType() {
        return new ProductInformationObjectType();
    }

    /**
     * Create an instance of {@link MaterialCompositionInformationDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MaterialCompositionInformationDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:01.02", name = "MaterialCompositionInformationDistribution")
    public MaterialCompositionInformationDistribution createMaterialCompositionInformationDistribution(MaterialCompositionInformationDistributionType value) {
        return new MaterialCompositionInformationDistribution(value);
    }

}
