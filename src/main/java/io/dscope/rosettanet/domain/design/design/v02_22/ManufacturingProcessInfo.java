
package io.dscope.rosettanet.domain.design.design.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManufacturingProcessInfo
    extends JAXBElement<ManufacturingProcessInfoType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.22", "ManufacturingProcessInfo");

    public ManufacturingProcessInfo(ManufacturingProcessInfoType value) {
        super(NAME, ((Class) ManufacturingProcessInfoType.class), null, value);
    }

    public ManufacturingProcessInfo() {
        super(NAME, ((Class) ManufacturingProcessInfoType.class), null, null);
    }

}
