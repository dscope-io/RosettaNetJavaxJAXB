
package io.dscope.rosettanet.universal.dates.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateTimePeriod
    extends JAXBElement<DateTimePeriodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", "DateTimePeriod");

    public DateTimePeriod(DateTimePeriodType value) {
        super(NAME, ((Class) DateTimePeriodType.class), null, value);
    }

    public DateTimePeriod() {
        super(NAME, ((Class) DateTimePeriodType.class), null, null);
    }

}
