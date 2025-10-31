
package io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:01.03", "PortTypeA");

    public PortTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PortTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
