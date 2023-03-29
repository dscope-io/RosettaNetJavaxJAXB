
package io.dscope.rosettanet.universal.contactinformation.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContactInformation
    extends JAXBElement<ContactInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04", "ContactInformation");

    public ContactInformation(ContactInformationType value) {
        super(NAME, ((Class) ContactInformationType.class), null, value);
    }

    public ContactInformation() {
        super(NAME, ((Class) ContactInformationType.class), null, null);
    }

}
