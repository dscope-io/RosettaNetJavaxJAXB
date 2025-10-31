
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MeasurementUnit
    extends JAXBElement<MeasurementUnitType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", "MeasurementUnit");

    public MeasurementUnit(MeasurementUnitType value) {
        super(NAME, ((Class) MeasurementUnitType.class), null, value);
    }

    public MeasurementUnit() {
        super(NAME, ((Class) MeasurementUnitType.class), null, null);
    }

}
