
package io.dscope.rosettanet.domain.procurement.procurement.v02_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastProductSchedule
    extends JAXBElement<ForecastProductScheduleType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", "ForecastProductSchedule");

    public ForecastProductSchedule(ForecastProductScheduleType value) {
        super(NAME, ((Class) ForecastProductScheduleType.class), null, value);
    }

    public ForecastProductSchedule() {
        super(NAME, ((Class) ForecastProductScheduleType.class), null, null);
    }

}
