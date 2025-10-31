
package io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialInstructionCategoryA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.04", "SpecialInstructionCategoryA");

    public SpecialInstructionCategoryA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SpecialInstructionCategoryA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
