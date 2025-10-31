
package io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PCMParmTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:PCMParmType:xsd:codelist:01.03", "PCMParmTypeA");

    public PCMParmTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PCMParmTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
