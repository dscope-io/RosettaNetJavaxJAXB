
package io.dscope.rosettanet.universal.partneridentification.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class KnownPartnerContact
    extends JAXBElement<KnownPartnerContactType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", "KnownPartnerContact");

    public KnownPartnerContact(KnownPartnerContactType value) {
        super(NAME, ((Class) KnownPartnerContactType.class), null, value);
    }

    public KnownPartnerContact() {
        super(NAME, ((Class) KnownPartnerContactType.class), null, null);
    }

}
