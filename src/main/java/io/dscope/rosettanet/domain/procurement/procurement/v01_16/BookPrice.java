
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BookPrice
    extends JAXBElement<BookPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "BookPrice");

    public BookPrice(BookPriceType value) {
        super(NAME, ((Class) BookPriceType.class), null, value);
    }

    public BookPrice() {
        super(NAME, ((Class) BookPriceType.class), null, null);
    }

}
