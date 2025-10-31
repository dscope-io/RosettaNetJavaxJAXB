
package io.dscope.rosettanet.domain.procurement.procurement.v02_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AccountSummary
    extends JAXBElement<AccountSummaryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", "AccountSummary");

    public AccountSummary(AccountSummaryType value) {
        super(NAME, ((Class) AccountSummaryType.class), null, value);
    }

    public AccountSummary() {
        super(NAME, ((Class) AccountSummaryType.class), null, null);
    }

}
