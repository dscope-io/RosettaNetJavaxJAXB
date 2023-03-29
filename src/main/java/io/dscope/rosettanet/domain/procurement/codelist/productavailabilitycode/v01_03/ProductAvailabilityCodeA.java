
package io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductAvailabilityCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", "ProductAvailabilityCodeA");

    public ProductAvailabilityCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductAvailabilityCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
