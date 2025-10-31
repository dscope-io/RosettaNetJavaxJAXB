
package io.dscope.rosettanet.system.standarddocumentheader.v01_24;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PipVersion
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", "PipVersion");

    public PipVersion(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public PipVersion() {
        super(NAME, ((Class) String.class), null, null);
    }

}
