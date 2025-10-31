
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManufacturedDate
    extends JAXBElement<ManufacturedDateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.08", "ManufacturedDate");

    public ManufacturedDate(ManufacturedDateType value) {
        super(NAME, ((Class) ManufacturedDateType.class), null, value);
    }

    public ManufacturedDate() {
        super(NAME, ((Class) ManufacturedDateType.class), null, null);
    }

}
