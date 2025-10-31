
package io.dscope.rosettanet.domain.procurement.procurement.v02_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AccountDescription
    extends JAXBElement<AccountDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", "AccountDescription");

    public AccountDescription(AccountDescriptionType value) {
        super(NAME, ((Class) AccountDescriptionType.class), null, value);
    }

    public AccountDescription() {
        super(NAME, ((Class) AccountDescriptionType.class), null, null);
    }

}
