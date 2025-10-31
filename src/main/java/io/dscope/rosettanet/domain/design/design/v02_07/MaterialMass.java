
package io.dscope.rosettanet.domain.design.design.v02_07;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MaterialMass
    extends JAXBElement<MaterialMassType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.07", "MaterialMass");

    public MaterialMass(MaterialMassType value) {
        super(NAME, ((Class) MaterialMassType.class), null, value);
    }

    public MaterialMass() {
        super(NAME, ((Class) MaterialMassType.class), null, null);
    }

}
