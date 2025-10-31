
package io.dscope.rosettanet.system.standarddocumentheader.v01_24;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentManifest
    extends JAXBElement<DocumentManifestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", "DocumentManifest");

    public DocumentManifest(DocumentManifestType value) {
        super(NAME, ((Class) DocumentManifestType.class), null, value);
    }

    public DocumentManifest() {
        super(NAME, ((Class) DocumentManifestType.class), null, null);
    }

}
