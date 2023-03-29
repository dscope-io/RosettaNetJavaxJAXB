
package io.dscope.rosettanet.domain.shared.shared.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManufacturedDate
    extends JAXBElement<ManufacturedDateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", "ManufacturedDate");

    public ManufacturedDate(ManufacturedDateType value) {
        super(NAME, ((Class) ManufacturedDateType.class), null, value);
    }

    public ManufacturedDate() {
        super(NAME, ((Class) ManufacturedDateType.class), null, null);
    }

}