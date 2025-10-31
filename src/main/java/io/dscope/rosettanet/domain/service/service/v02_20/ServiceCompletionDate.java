
package io.dscope.rosettanet.domain.service.service.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class ServiceCompletionDate
    extends JAXBElement<XMLGregorianCalendar>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "ServiceCompletionDate");

    public ServiceCompletionDate(XMLGregorianCalendar value) {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, value);
    }

    public ServiceCompletionDate() {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, null);
    }

}
