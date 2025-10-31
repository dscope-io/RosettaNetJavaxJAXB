
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StartAndEndDateTime
    extends JAXBElement<StartAndEndDateTimeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", "StartAndEndDateTime");

    public StartAndEndDateTime(StartAndEndDateTimeType value) {
        super(NAME, ((Class) StartAndEndDateTimeType.class), null, value);
    }

    public StartAndEndDateTime() {
        super(NAME, ((Class) StartAndEndDateTimeType.class), null, null);
    }

}
