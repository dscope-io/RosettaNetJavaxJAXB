
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductQuantityRange
    extends JAXBElement<ProductQuantityRangeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "ProductQuantityRange");

    public ProductQuantityRange(ProductQuantityRangeType value) {
        super(NAME, ((Class) ProductQuantityRangeType.class), null, value);
    }

    public ProductQuantityRange() {
        super(NAME, ((Class) ProductQuantityRangeType.class), null, null);
    }

}