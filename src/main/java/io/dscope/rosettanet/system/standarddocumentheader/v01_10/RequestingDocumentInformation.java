
package io.dscope.rosettanet.system.standarddocumentheader.v01_10;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestingDocumentInformation
    extends JAXBElement<RequestingDocumentInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", "RequestingDocumentInformation");

    public RequestingDocumentInformation(RequestingDocumentInformationType value) {
        super(NAME, ((Class) RequestingDocumentInformationType.class), null, value);
    }

    public RequestingDocumentInformation() {
        super(NAME, ((Class) RequestingDocumentInformationType.class), null, null);
    }

}
