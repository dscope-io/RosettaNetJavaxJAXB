
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class RegistrationSubmissionDate
    extends JAXBElement<XMLGregorianCalendar>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "RegistrationSubmissionDate");

    public RegistrationSubmissionDate(XMLGregorianCalendar value) {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, value);
    }

    public RegistrationSubmissionDate() {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, null);
    }

}
