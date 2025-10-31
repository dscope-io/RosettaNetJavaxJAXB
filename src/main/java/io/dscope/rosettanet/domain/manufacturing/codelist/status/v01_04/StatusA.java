
package io.dscope.rosettanet.domain.manufacturing.codelist.status.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Status:xsd:codelist:01.04", "StatusA");

    public StatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public StatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
