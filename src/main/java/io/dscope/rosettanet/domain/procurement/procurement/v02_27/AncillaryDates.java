
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AncillaryDates
    extends JAXBElement<AncillaryDatesType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", "AncillaryDates");

    public AncillaryDates(AncillaryDatesType value) {
        super(NAME, ((Class) AncillaryDatesType.class), null, value);
    }

    public AncillaryDates() {
        super(NAME, ((Class) AncillaryDatesType.class), null, null);
    }

}
