
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ItemQuantity
    extends JAXBElement<ItemQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "ItemQuantity");

    public ItemQuantity(ItemQuantityType value) {
        super(NAME, ((Class) ItemQuantityType.class), null, value);
    }

    public ItemQuantity() {
        super(NAME, ((Class) ItemQuantityType.class), null, null);
    }

}
