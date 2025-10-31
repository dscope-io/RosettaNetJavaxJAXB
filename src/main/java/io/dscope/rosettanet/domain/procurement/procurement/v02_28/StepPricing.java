
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StepPricing
    extends JAXBElement<StepPricingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "StepPricing");

    public StepPricing(StepPricingType value) {
        super(NAME, ((Class) StepPricingType.class), null, value);
    }

    public StepPricing() {
        super(NAME, ((Class) StepPricingType.class), null, null);
    }

}
