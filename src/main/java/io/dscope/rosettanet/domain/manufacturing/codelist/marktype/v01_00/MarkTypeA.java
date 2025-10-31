
package io.dscope.rosettanet.domain.manufacturing.codelist.marktype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:1.0", "MarkTypeA");

    public MarkTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MarkTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
