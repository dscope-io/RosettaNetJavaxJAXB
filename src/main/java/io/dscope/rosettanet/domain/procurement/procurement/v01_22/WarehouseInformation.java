
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarehouseInformation
    extends JAXBElement<WarehouseInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "WarehouseInformation");

    public WarehouseInformation(WarehouseInformationType value) {
        super(NAME, ((Class) WarehouseInformationType.class), null, value);
    }

    public WarehouseInformation() {
        super(NAME, ((Class) WarehouseInformationType.class), null, null);
    }

}
