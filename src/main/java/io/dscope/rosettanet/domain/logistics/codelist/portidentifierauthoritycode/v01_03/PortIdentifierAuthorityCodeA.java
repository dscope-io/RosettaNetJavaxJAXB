
package io.dscope.rosettanet.domain.logistics.codelist.portidentifierauthoritycode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortIdentifierAuthorityCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PortIdentifierAuthorityCode:xsd:codelist:01.03", "PortIdentifierAuthorityCodeA");

    public PortIdentifierAuthorityCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PortIdentifierAuthorityCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
