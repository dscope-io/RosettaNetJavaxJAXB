
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastIdentifierReference
    extends JAXBElement<ForecastIdentifierReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", "ForecastIdentifierReference");

    public ForecastIdentifierReference(ForecastIdentifierReferenceType value) {
        super(NAME, ((Class) ForecastIdentifierReferenceType.class), null, value);
    }

    public ForecastIdentifierReference() {
        super(NAME, ((Class) ForecastIdentifierReferenceType.class), null, null);
    }

}
