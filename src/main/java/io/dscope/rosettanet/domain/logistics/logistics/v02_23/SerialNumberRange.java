
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SerialNumberRange
    extends JAXBElement<SerialNumberRangeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "SerialNumberRange");

    public SerialNumberRange(SerialNumberRangeType value) {
        super(NAME, ((Class) SerialNumberRangeType.class), null, value);
    }

    public SerialNumberRange() {
        super(NAME, ((Class) SerialNumberRangeType.class), null, null);
    }

}
