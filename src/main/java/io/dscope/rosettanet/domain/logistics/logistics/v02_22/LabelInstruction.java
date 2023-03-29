
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LabelInstruction
    extends JAXBElement<LabelInstructionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", "LabelInstruction");

    public LabelInstruction(LabelInstructionType value) {
        super(NAME, ((Class) LabelInstructionType.class), null, value);
    }

    public LabelInstruction() {
        super(NAME, ((Class) LabelInstructionType.class), null, null);
    }

}
