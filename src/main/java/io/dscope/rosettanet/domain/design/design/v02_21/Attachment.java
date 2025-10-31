
package io.dscope.rosettanet.domain.design.design.v02_21;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Attachment
    extends JAXBElement<AttachmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.21", "Attachment");

    public Attachment(AttachmentType value) {
        super(NAME, ((Class) AttachmentType.class), null, value);
    }

    public Attachment() {
        super(NAME, ((Class) AttachmentType.class), null, null);
    }

}
