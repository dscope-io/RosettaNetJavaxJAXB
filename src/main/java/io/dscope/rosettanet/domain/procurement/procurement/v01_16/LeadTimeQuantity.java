
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LeadTimeQuantity
    extends JAXBElement<LeadTimeQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "LeadTimeQuantity");

    public LeadTimeQuantity(LeadTimeQuantityType value) {
        super(NAME, ((Class) LeadTimeQuantityType.class), null, value);
    }

    public LeadTimeQuantity() {
        super(NAME, ((Class) LeadTimeQuantityType.class), null, null);
    }

}
