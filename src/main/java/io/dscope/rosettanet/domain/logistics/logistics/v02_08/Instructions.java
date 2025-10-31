
package io.dscope.rosettanet.domain.logistics.logistics.v02_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Instructions
    extends JAXBElement<InstructionsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", "Instructions");

    public Instructions(InstructionsType value) {
        super(NAME, ((Class) InstructionsType.class), null, value);
    }

    public Instructions() {
        super(NAME, ((Class) InstructionsType.class), null, null);
    }

}
