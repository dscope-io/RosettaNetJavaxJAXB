
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteConfirmation
    extends JAXBElement<QuoteConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.02", "QuoteConfirmation");

    public QuoteConfirmation(QuoteConfirmationType value) {
        super(NAME, ((Class) QuoteConfirmationType.class), null, value);
    }

    public QuoteConfirmation() {
        super(NAME, ((Class) QuoteConfirmationType.class), null, null);
    }

}