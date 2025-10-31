
package io.dscope.rosettanet.domain.design.design.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReferenceLocator
    extends JAXBElement<ReferenceLocatorType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.22", "ReferenceLocator");

    public ReferenceLocator(ReferenceLocatorType value) {
        super(NAME, ((Class) ReferenceLocatorType.class), null, value);
    }

    public ReferenceLocator() {
        super(NAME, ((Class) ReferenceLocatorType.class), null, null);
    }

}
