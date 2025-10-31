
package io.dscope.rosettanet.domain.service.service.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class ServiceStartDate
    extends JAXBElement<XMLGregorianCalendar>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "ServiceStartDate");

    public ServiceStartDate(XMLGregorianCalendar value) {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, value);
    }

    public ServiceStartDate() {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, null);
    }

}
