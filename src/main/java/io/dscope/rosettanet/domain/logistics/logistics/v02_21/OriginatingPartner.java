
package io.dscope.rosettanet.domain.logistics.logistics.v02_21;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OriginatingPartner
    extends JAXBElement<OriginatingPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.21", "OriginatingPartner");

    public OriginatingPartner(OriginatingPartnerType value) {
        super(NAME, ((Class) OriginatingPartnerType.class), null, value);
    }

    public OriginatingPartner() {
        super(NAME, ((Class) OriginatingPartnerType.class), null, null);
    }

}
