
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Handbook
    extends JAXBElement<HandbookType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "Handbook");

    public Handbook(HandbookType value) {
        super(NAME, ((Class) HandbookType.class), null, value);
    }

    public Handbook() {
        super(NAME, ((Class) HandbookType.class), null, null);
    }

}
