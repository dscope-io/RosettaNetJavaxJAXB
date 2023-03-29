
package io.dscope.rosettanet.universal.partneridentification.v01_16;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartnerDescription
    extends JAXBElement<PartnerDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", "PartnerDescription");

    public PartnerDescription(PartnerDescriptionType value) {
        super(NAME, ((Class) PartnerDescriptionType.class), null, value);
    }

    public PartnerDescription() {
        super(NAME, ((Class) PartnerDescriptionType.class), null, null);
    }

}
