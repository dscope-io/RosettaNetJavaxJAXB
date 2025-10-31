
package io.dscope.rosettanet.domain.design.design.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SubpartIdentifier
    extends JAXBElement<SubpartIdentifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "SubpartIdentifier");

    public SubpartIdentifier(SubpartIdentifierType value) {
        super(NAME, ((Class) SubpartIdentifierType.class), null, value);
    }

    public SubpartIdentifier() {
        super(NAME, ((Class) SubpartIdentifierType.class), null, null);
    }

}
