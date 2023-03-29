
package io.dscope.rosettanet.universal.partneridentification.v01_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IntermittentPartner
    extends JAXBElement<IntermittentPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08", "IntermittentPartner");

    public IntermittentPartner(IntermittentPartnerType value) {
        super(NAME, ((Class) IntermittentPartnerType.class), null, value);
    }

    public IntermittentPartner() {
        super(NAME, ((Class) IntermittentPartnerType.class), null, null);
    }

}
