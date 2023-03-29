
package io.dscope.rosettanet.system.standarddocumentheader.v01_11;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class VersionIdentifier
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11", "VersionIdentifier");

    public VersionIdentifier(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public VersionIdentifier() {
        super(NAME, ((Class) String.class), null, null);
    }

}
