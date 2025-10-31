
package io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkSideA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:01.03", "MarkSideA");

    public MarkSideA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MarkSideA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
