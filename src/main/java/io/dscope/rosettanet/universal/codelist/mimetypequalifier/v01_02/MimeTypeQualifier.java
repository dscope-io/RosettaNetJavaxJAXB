
package io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MimeTypeQualifier
    extends JAXBElement<MimeTypeQualifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", "MimeTypeQualifier");

    public MimeTypeQualifier(MimeTypeQualifierType value) {
        super(NAME, ((Class) MimeTypeQualifierType.class), null, value);
    }

    public MimeTypeQualifier() {
        super(NAME, ((Class) MimeTypeQualifierType.class), null, null);
    }

}
