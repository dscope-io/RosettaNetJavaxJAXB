
package io.dscope.rosettanet.domain.service.service.v02_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Part
    extends JAXBElement<PartType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "Part");

    public Part(PartType value) {
        super(NAME, ((Class) PartType.class), null, value);
    }

    public Part() {
        super(NAME, ((Class) PartType.class), null, null);
    }

}
