
package io.dscope.rosettanet.domain.design.design.v02_19;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Note
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.19", "Note");

    public Note(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Note() {
        super(NAME, ((Class) String.class), null, null);
    }

}
