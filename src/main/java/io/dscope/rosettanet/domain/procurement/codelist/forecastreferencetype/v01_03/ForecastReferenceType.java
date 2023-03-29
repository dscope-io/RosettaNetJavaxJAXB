
package io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastReferenceType
    extends JAXBElement<ForecastReferenceTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03", "ForecastReferenceType");

    public ForecastReferenceType(ForecastReferenceTypeType value) {
        super(NAME, ((Class) ForecastReferenceTypeType.class), null, value);
    }

    public ForecastReferenceType() {
        super(NAME, ((Class) ForecastReferenceTypeType.class), null, null);
    }

}
