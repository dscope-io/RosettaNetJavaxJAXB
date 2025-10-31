
package io.dscope.rosettanet.universal.contactinformation.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContactAndPhone
    extends JAXBElement<ContactAndPhoneType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.01", "ContactAndPhone");

    public ContactAndPhone(ContactAndPhoneType value) {
        super(NAME, ((Class) ContactAndPhoneType.class), null, value);
    }

    public ContactAndPhone() {
        super(NAME, ((Class) ContactAndPhoneType.class), null, null);
    }

}
