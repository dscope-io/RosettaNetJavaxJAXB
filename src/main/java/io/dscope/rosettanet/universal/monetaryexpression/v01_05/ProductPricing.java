
package io.dscope.rosettanet.universal.monetaryexpression.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPricing
    extends JAXBElement<ProductPricingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05", "ProductPricing");

    public ProductPricing(ProductPricingType value) {
        super(NAME, ((Class) ProductPricingType.class), null, value);
    }

    public ProductPricing() {
        super(NAME, ((Class) ProductPricingType.class), null, null);
    }

}
