
package io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteType
    extends JAXBElement<QuoteTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:1.0", "QuoteType");

    public QuoteType(QuoteTypeType value) {
        super(NAME, ((Class) QuoteTypeType.class), null, value);
    }

    public QuoteType() {
        super(NAME, ((Class) QuoteTypeType.class), null, null);
    }

}
