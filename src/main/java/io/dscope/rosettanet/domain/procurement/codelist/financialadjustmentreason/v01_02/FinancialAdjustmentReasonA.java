
package io.dscope.rosettanet.domain.procurement.codelist.financialadjustmentreason.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinancialAdjustmentReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FinancialAdjustmentReason:xsd:codelist:01.02", "FinancialAdjustmentReasonA");

    public FinancialAdjustmentReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FinancialAdjustmentReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
