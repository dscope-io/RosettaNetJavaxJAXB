
package io.dscope.rosettanet.universal.dates.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DatePeriod
    extends JAXBElement<DatePeriodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Dates:xsd:schema:1.0", "DatePeriod");

    public DatePeriod(DatePeriodType value) {
        super(NAME, ((Class) DatePeriodType.class), null, value);
    }

    public DatePeriod() {
        super(NAME, ((Class) DatePeriodType.class), null, null);
    }

}
