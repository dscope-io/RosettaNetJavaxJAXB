
package io.dscope.rosettanet.domain.logistics.logistics.v02_21;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ExportDeclaration
    extends JAXBElement<ExportDeclarationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.21", "ExportDeclaration");

    public ExportDeclaration(ExportDeclarationType value) {
        super(NAME, ((Class) ExportDeclarationType.class), null, value);
    }

    public ExportDeclaration() {
        super(NAME, ((Class) ExportDeclarationType.class), null, null);
    }

}
