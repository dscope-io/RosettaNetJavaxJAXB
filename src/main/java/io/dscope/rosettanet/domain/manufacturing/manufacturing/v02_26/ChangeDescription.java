
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChangeDescription
    extends JAXBElement<ChangeDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26", "ChangeDescription");

    public ChangeDescription(ChangeDescriptionType value) {
        super(NAME, ((Class) ChangeDescriptionType.class), null, value);
    }

    public ChangeDescription() {
        super(NAME, ((Class) ChangeDescriptionType.class), null, null);
    }

}
