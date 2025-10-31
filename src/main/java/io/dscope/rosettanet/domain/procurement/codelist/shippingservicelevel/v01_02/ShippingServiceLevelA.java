
package io.dscope.rosettanet.domain.procurement.codelist.shippingservicelevel.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingServiceLevelA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ShippingServiceLevel:xsd:codelist:01.02", "ShippingServiceLevelA");

    public ShippingServiceLevelA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingServiceLevelA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
