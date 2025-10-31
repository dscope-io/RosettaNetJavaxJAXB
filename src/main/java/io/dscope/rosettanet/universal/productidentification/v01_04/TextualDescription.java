
package io.dscope.rosettanet.universal.productidentification.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TextualDescription
    extends JAXBElement<TextualDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", "TextualDescription");

    public TextualDescription(TextualDescriptionType value) {
        super(NAME, ((Class) TextualDescriptionType.class), null, value);
    }

    public TextualDescription() {
        super(NAME, ((Class) TextualDescriptionType.class), null, null);
    }

}
