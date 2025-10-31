
package io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryOwnershipA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.00", "InventoryOwnershipA");

    public InventoryOwnershipA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InventoryOwnershipA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
