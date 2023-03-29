
package io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MimeTypeQualifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", "MimeTypeQualifierA");

    public MimeTypeQualifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MimeTypeQualifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}