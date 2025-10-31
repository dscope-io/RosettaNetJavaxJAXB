
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DatePeriodAndDuration
    extends JAXBElement<DatePeriodAndDurationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "DatePeriodAndDuration");

    public DatePeriodAndDuration(DatePeriodAndDurationType value) {
        super(NAME, ((Class) DatePeriodAndDurationType.class), null, value);
    }

    public DatePeriodAndDuration() {
        super(NAME, ((Class) DatePeriodAndDurationType.class), null, null);
    }

}
