
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03", "ProcessTypeA");

    public ProcessTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProcessTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
