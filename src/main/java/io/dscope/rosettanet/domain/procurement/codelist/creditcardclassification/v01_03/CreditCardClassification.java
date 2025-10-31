
package io.dscope.rosettanet.domain.procurement.codelist.creditcardclassification.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CreditCardClassification
    extends JAXBElement<CreditCardClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.03", "CreditCardClassification");

    public CreditCardClassification(CreditCardClassificationType value) {
        super(NAME, ((Class) CreditCardClassificationType.class), null, value);
    }

    public CreditCardClassification() {
        super(NAME, ((Class) CreditCardClassificationType.class), null, null);
    }

}
