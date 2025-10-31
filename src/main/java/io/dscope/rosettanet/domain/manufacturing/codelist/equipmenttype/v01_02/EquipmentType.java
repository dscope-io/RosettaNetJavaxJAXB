
package io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class EquipmentType
    extends JAXBElement<EquipmentTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02", "EquipmentType");

    public EquipmentType(EquipmentTypeType value) {
        super(NAME, ((Class) EquipmentTypeType.class), null, value);
    }

    public EquipmentType() {
        super(NAME, ((Class) EquipmentTypeType.class), null, null);
    }

}
