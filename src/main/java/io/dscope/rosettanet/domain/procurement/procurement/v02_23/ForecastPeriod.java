
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastPeriod
    extends JAXBElement<ForecastPeriodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", "ForecastPeriod");

    public ForecastPeriod(ForecastPeriodType value) {
        super(NAME, ((Class) ForecastPeriodType.class), null, value);
    }

    public ForecastPeriod() {
        super(NAME, ((Class) ForecastPeriodType.class), null, null);
    }

}
