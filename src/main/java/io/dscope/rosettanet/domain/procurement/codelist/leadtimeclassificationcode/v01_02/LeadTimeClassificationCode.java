
package io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LeadTimeClassificationCode
    extends JAXBElement<LeadTimeClassificationCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02", "LeadTimeClassificationCode");

    public LeadTimeClassificationCode(LeadTimeClassificationCodeType value) {
        super(NAME, ((Class) LeadTimeClassificationCodeType.class), null, value);
    }

    public LeadTimeClassificationCode() {
        super(NAME, ((Class) LeadTimeClassificationCodeType.class), null, null);
    }

}
