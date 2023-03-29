
package io.dscope.rosettanet.universal.partneridentification.v01_07;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NewPartner
    extends JAXBElement<NewPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07", "NewPartner");

    public NewPartner(NewPartnerType value) {
        super(NAME, ((Class) NewPartnerType.class), null, value);
    }

    public NewPartner() {
        super(NAME, ((Class) NewPartnerType.class), null, null);
    }

}
