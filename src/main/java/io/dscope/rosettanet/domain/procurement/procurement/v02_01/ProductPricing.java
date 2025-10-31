
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPricing
    extends JAXBElement<ProductPricingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "ProductPricing");

    public ProductPricing(ProductPricingType value) {
        super(NAME, ((Class) ProductPricingType.class), null, value);
    }

    public ProductPricing() {
        super(NAME, ((Class) ProductPricingType.class), null, null);
    }

}
