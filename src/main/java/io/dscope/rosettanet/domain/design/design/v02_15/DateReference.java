
package io.dscope.rosettanet.domain.design.design.v02_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateReference
    extends JAXBElement<DateReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.15", "DateReference");

    public DateReference(DateReferenceType value) {
        super(NAME, ((Class) DateReferenceType.class), null, value);
    }

    public DateReference() {
        super(NAME, ((Class) DateReferenceType.class), null, null);
    }

}
