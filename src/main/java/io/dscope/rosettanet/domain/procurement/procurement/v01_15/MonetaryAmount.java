
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MonetaryAmount
    extends JAXBElement<MonetaryAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "MonetaryAmount");

    public MonetaryAmount(MonetaryAmountType value) {
        super(NAME, ((Class) MonetaryAmountType.class), null, value);
    }

    public MonetaryAmount() {
        super(NAME, ((Class) MonetaryAmountType.class), null, null);
    }

}
