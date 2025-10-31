
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryItemIdentification
    extends JAXBElement<InventoryItemIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "InventoryItemIdentification");

    public InventoryItemIdentification(InventoryItemIdentificationType value) {
        super(NAME, ((Class) InventoryItemIdentificationType.class), null, value);
    }

    public InventoryItemIdentification() {
        super(NAME, ((Class) InventoryItemIdentificationType.class), null, null);
    }

}
