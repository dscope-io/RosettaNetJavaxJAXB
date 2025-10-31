
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProprietaryUnits
    extends JAXBElement<ProprietaryUnitsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "ProprietaryUnits");

    public ProprietaryUnits(ProprietaryUnitsType value) {
        super(NAME, ((Class) ProprietaryUnitsType.class), null, value);
    }

    public ProprietaryUnits() {
        super(NAME, ((Class) ProprietaryUnitsType.class), null, null);
    }

}
