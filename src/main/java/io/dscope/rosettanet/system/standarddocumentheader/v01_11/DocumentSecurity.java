
package io.dscope.rosettanet.system.standarddocumentheader.v01_11;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentSecurity
    extends JAXBElement<DocumentSecurityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11", "DocumentSecurity");

    public DocumentSecurity(DocumentSecurityType value) {
        super(NAME, ((Class) DocumentSecurityType.class), null, value);
    }

    public DocumentSecurity() {
        super(NAME, ((Class) DocumentSecurityType.class), null, null);
    }

}