
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WorkInProcessType:xsd:codelist:01.02", "WorkInProcessTypeA");

    public WorkInProcessTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WorkInProcessTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
