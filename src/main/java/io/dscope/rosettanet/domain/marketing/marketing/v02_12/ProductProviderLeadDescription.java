
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductProviderLeadDescription
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "ProductProviderLeadDescription");

    public ProductProviderLeadDescription(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public ProductProviderLeadDescription() {
        super(NAME, ((Class) String.class), null, null);
    }

}
