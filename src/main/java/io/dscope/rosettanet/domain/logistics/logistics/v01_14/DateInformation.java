
package io.dscope.rosettanet.domain.logistics.logistics.v01_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateInformation
    extends JAXBElement<DateInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.14", "DateInformation");

    public DateInformation(DateInformationType value) {
        super(NAME, ((Class) DateInformationType.class), null, value);
    }

    public DateInformation() {
        super(NAME, ((Class) DateInformationType.class), null, null);
    }

}
