
package io.dscope.rosettanet.domain.procurement.procurement.v02_25;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SecondaryBuyer
    extends JAXBElement<SecondaryBuyerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", "SecondaryBuyer");

    public SecondaryBuyer(SecondaryBuyerType value) {
        super(NAME, ((Class) SecondaryBuyerType.class), null, value);
    }

    public SecondaryBuyer() {
        super(NAME, ((Class) SecondaryBuyerType.class), null, null);
    }

}