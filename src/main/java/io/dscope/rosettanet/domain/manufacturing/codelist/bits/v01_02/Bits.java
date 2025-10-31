
package io.dscope.rosettanet.domain.manufacturing.codelist.bits.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Bits
    extends JAXBElement<BitsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Bits:xsd:codelist:01.02", "Bits");

    public Bits(BitsType value) {
        super(NAME, ((Class) BitsType.class), null, value);
    }

    public Bits() {
        super(NAME, ((Class) BitsType.class), null, null);
    }

}
