
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialHandlingInstruction
    extends JAXBElement<SpecialHandlingInstructionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "SpecialHandlingInstruction");

    public SpecialHandlingInstruction(SpecialHandlingInstructionType value) {
        super(NAME, ((Class) SpecialHandlingInstructionType.class), null, value);
    }

    public SpecialHandlingInstruction() {
        super(NAME, ((Class) SpecialHandlingInstructionType.class), null, null);
    }

}
