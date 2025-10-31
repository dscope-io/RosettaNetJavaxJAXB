
package io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingServiceLevel
    extends JAXBElement<ShippingServiceLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.00", "ShippingServiceLevel");

    public ShippingServiceLevel(ShippingServiceLevelType value) {
        super(NAME, ((Class) ShippingServiceLevelType.class), null, value);
    }

    public ShippingServiceLevel() {
        super(NAME, ((Class) ShippingServiceLevelType.class), null, null);
    }

}
