
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarehouseQuantityInformation
    extends JAXBElement<WarehouseQuantityInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "WarehouseQuantityInformation");

    public WarehouseQuantityInformation(WarehouseQuantityInformationType value) {
        super(NAME, ((Class) WarehouseQuantityInformationType.class), null, value);
    }

    public WarehouseQuantityInformation() {
        super(NAME, ((Class) WarehouseQuantityInformationType.class), null, null);
    }

}
