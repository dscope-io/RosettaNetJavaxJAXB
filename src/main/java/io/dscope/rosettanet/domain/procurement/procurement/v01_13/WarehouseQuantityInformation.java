
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarehouseQuantityInformation
    extends JAXBElement<WarehouseQuantityInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", "WarehouseQuantityInformation");

    public WarehouseQuantityInformation(WarehouseQuantityInformationType value) {
        super(NAME, ((Class) WarehouseQuantityInformationType.class), null, value);
    }

    public WarehouseQuantityInformation() {
        super(NAME, ((Class) WarehouseQuantityInformationType.class), null, null);
    }

}
