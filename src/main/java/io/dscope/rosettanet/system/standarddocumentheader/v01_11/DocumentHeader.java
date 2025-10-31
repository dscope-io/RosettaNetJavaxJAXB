
package io.dscope.rosettanet.system.standarddocumentheader.v01_11;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentHeader
    extends JAXBElement<DocumentHeaderType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11", "DocumentHeader");

    public DocumentHeader(DocumentHeaderType value) {
        super(NAME, ((Class) DocumentHeaderType.class), null, value);
    }

    public DocumentHeader() {
        super(NAME, ((Class) DocumentHeaderType.class), null, null);
    }

}
