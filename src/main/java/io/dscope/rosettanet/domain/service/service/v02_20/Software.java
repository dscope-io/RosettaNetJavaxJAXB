
package io.dscope.rosettanet.domain.service.service.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Software
    extends JAXBElement<SoftwareType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "Software");

    public Software(SoftwareType value) {
        super(NAME, ((Class) SoftwareType.class), null, value);
    }

    public Software() {
        super(NAME, ((Class) SoftwareType.class), null, null);
    }

}
