
package io.dscope.rosettanet.domain.service.service.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class PurchaseDate
    extends JAXBElement<XMLGregorianCalendar>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "PurchaseDate");

    public PurchaseDate(XMLGregorianCalendar value) {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, value);
    }

    public PurchaseDate() {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, null);
    }

}
