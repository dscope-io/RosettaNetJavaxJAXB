
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPricingDetail
    extends JAXBElement<ProductPricingDetailType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "ProductPricingDetail");

    public ProductPricingDetail(ProductPricingDetailType value) {
        super(NAME, ((Class) ProductPricingDetailType.class), null, value);
    }

    public ProductPricingDetail() {
        super(NAME, ((Class) ProductPricingDetailType.class), null, null);
    }

}
