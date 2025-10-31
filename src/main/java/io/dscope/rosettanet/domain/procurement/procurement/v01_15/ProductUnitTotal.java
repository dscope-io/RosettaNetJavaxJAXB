
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductUnitTotal
    extends JAXBElement<ProductUnitTotalType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "ProductUnitTotal");

    public ProductUnitTotal(ProductUnitTotalType value) {
        super(NAME, ((Class) ProductUnitTotalType.class), null, value);
    }

    public ProductUnitTotal() {
        super(NAME, ((Class) ProductUnitTotalType.class), null, null);
    }

}
