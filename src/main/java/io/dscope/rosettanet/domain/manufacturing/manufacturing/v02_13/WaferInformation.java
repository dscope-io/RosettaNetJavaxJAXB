
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferInformation
    extends JAXBElement<WaferInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", "WaferInformation");

    public WaferInformation(WaferInformationType value) {
        super(NAME, ((Class) WaferInformationType.class), null, value);
    }

    public WaferInformation() {
        super(NAME, ((Class) WaferInformationType.class), null, null);
    }

}
