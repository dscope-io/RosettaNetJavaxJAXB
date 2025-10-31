
package io.dscope.rosettanet.domain.procurement.procurement.v02_30;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PricingDetail
    extends JAXBElement<PricingDetailType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", "PricingDetail");

    public PricingDetail(PricingDetailType value) {
        super(NAME, ((Class) PricingDetailType.class), null, value);
    }

    public PricingDetail() {
        super(NAME, ((Class) PricingDetailType.class), null, null);
    }

}
