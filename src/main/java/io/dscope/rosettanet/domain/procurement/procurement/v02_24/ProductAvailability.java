
package io.dscope.rosettanet.domain.procurement.procurement.v02_24;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductAvailability
    extends JAXBElement<ProductAvailabilityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24", "ProductAvailability");

    public ProductAvailability(ProductAvailabilityType value) {
        super(NAME, ((Class) ProductAvailabilityType.class), null, value);
    }

    public ProductAvailability() {
        super(NAME, ((Class) ProductAvailabilityType.class), null, null);
    }

}
