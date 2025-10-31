
package io.dscope.rosettanet.system.standarddocumentheader.v01_13;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StandardDocumentIdentification
    extends JAXBElement<StandardDocumentIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.13", "StandardDocumentIdentification");

    public StandardDocumentIdentification(StandardDocumentIdentificationType value) {
        super(NAME, ((Class) StandardDocumentIdentificationType.class), null, value);
    }

    public StandardDocumentIdentification() {
        super(NAME, ((Class) StandardDocumentIdentificationType.class), null, null);
    }

}
