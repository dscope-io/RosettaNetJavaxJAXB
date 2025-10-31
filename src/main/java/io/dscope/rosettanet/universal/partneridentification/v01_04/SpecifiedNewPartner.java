
package io.dscope.rosettanet.universal.partneridentification.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedNewPartner
    extends JAXBElement<SpecifiedNewPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04", "SpecifiedNewPartner");

    public SpecifiedNewPartner(SpecifiedNewPartnerType value) {
        super(NAME, ((Class) SpecifiedNewPartnerType.class), null, value);
    }

    public SpecifiedNewPartner() {
        super(NAME, ((Class) SpecifiedNewPartnerType.class), null, null);
    }

}
