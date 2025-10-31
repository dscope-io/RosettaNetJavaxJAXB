
package io.dscope.rosettanet.domain.logistics.logistics.v01_09;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OriginatingPartner
    extends JAXBElement<OriginatingPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09", "OriginatingPartner");

    public OriginatingPartner(OriginatingPartnerType value) {
        super(NAME, ((Class) OriginatingPartnerType.class), null, value);
    }

    public OriginatingPartner() {
        super(NAME, ((Class) OriginatingPartnerType.class), null, null);
    }

}
