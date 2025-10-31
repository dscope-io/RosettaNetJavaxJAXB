
package io.dscope.rosettanet.domain.design.design.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SubstanceMass
    extends JAXBElement<SubstanceMassType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "SubstanceMass");

    public SubstanceMass(SubstanceMassType value) {
        super(NAME, ((Class) SubstanceMassType.class), null, value);
    }

    public SubstanceMass() {
        super(NAME, ((Class) SubstanceMassType.class), null, null);
    }

}
