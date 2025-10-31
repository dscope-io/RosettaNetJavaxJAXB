
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChipPeriodicity
    extends JAXBElement<ChipPeriodicityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", "ChipPeriodicity");

    public ChipPeriodicity(ChipPeriodicityType value) {
        super(NAME, ((Class) ChipPeriodicityType.class), null, value);
    }

    public ChipPeriodicity() {
        super(NAME, ((Class) ChipPeriodicityType.class), null, null);
    }

}
