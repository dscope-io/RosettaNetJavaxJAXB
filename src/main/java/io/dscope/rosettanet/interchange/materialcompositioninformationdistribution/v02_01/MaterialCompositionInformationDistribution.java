
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "MaterialCompositionInformationDistribution", namespace = "urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:02.01")
public class MaterialCompositionInformationDistribution
    extends JAXBElement<MaterialCompositionInformationDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:02.01", "MaterialCompositionInformationDistribution");

    public MaterialCompositionInformationDistribution(MaterialCompositionInformationDistributionType value) {
        super(NAME, ((Class) MaterialCompositionInformationDistributionType.class), null, value);
    }

    public MaterialCompositionInformationDistribution() {
        super(NAME, ((Class) MaterialCompositionInformationDistributionType.class), null, null);
    }

}
