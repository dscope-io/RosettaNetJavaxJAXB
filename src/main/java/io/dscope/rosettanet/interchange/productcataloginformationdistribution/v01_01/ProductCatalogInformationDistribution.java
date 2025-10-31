
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ProductCatalogInformationDistribution", namespace = "urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01")
public class ProductCatalogInformationDistribution
    extends JAXBElement<ProductCatalogInformationDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01", "ProductCatalogInformationDistribution");

    public ProductCatalogInformationDistribution(ProductCatalogInformationDistributionType value) {
        super(NAME, ((Class) ProductCatalogInformationDistributionType.class), null, value);
    }

    public ProductCatalogInformationDistribution() {
        super(NAME, ((Class) ProductCatalogInformationDistributionType.class), null, null);
    }

}
