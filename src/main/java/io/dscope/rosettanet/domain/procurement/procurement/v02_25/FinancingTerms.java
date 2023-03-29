
package io.dscope.rosettanet.domain.procurement.procurement.v02_25;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinancingTerms
    extends JAXBElement<FinancingTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", "FinancingTerms");

    public FinancingTerms(FinancingTermsType value) {
        super(NAME, ((Class) FinancingTermsType.class), null, value);
    }

    public FinancingTerms() {
        super(NAME, ((Class) FinancingTermsType.class), null, null);
    }

}