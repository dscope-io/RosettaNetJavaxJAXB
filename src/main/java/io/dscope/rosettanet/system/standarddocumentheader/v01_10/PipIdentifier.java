
package io.dscope.rosettanet.system.standarddocumentheader.v01_10;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PipIdentifier
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", "PipIdentifier");

    public PipIdentifier(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public PipIdentifier() {
        super(NAME, ((Class) String.class), null, null);
    }

}
