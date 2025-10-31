
package io.dscope.rosettanet.universal.codelist.language.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LanguageA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Language:xsd:codelist:1.0", "LanguageA");

    public LanguageA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LanguageA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
