
package io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AttachmentDescriptionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:01.02", "AttachmentDescriptionA");

    public AttachmentDescriptionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public AttachmentDescriptionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
