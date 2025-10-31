
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipDateCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.02", "ShipDateCodeA");

    public ShipDateCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipDateCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
