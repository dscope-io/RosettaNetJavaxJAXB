
package io.dscope.rosettanet.domain.procurement.procurement.v02_30;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PriceCondition
    extends JAXBElement<PriceConditionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", "PriceCondition");

    public PriceCondition(PriceConditionType value) {
        super(NAME, ((Class) PriceConditionType.class), null, value);
    }

    public PriceCondition() {
        super(NAME, ((Class) PriceConditionType.class), null, null);
    }

}
