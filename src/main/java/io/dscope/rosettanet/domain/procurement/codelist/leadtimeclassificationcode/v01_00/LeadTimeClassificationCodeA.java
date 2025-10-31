
package io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LeadTimeClassificationCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:1.0", "LeadTimeClassificationCodeA");

    public LeadTimeClassificationCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LeadTimeClassificationCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
