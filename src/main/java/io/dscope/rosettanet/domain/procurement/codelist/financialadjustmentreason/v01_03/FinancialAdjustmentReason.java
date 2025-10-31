
package io.dscope.rosettanet.domain.procurement.codelist.financialadjustmentreason.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinancialAdjustmentReason
    extends JAXBElement<FinancialAdjustmentReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FinancialAdjustmentReason:xsd:codelist:01.03", "FinancialAdjustmentReason");

    public FinancialAdjustmentReason(FinancialAdjustmentReasonType value) {
        super(NAME, ((Class) FinancialAdjustmentReasonType.class), null, value);
    }

    public FinancialAdjustmentReason() {
        super(NAME, ((Class) FinancialAdjustmentReasonType.class), null, null);
    }

}
