
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferBacksideInformation
    extends JAXBElement<WaferBacksideInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "WaferBacksideInformation");

    public WaferBacksideInformation(WaferBacksideInformationType value) {
        super(NAME, ((Class) WaferBacksideInformationType.class), null, value);
    }

    public WaferBacksideInformation() {
        super(NAME, ((Class) WaferBacksideInformationType.class), null, null);
    }

}
