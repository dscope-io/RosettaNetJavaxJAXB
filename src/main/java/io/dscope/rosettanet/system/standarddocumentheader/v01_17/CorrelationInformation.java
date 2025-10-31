
package io.dscope.rosettanet.system.standarddocumentheader.v01_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CorrelationInformation
    extends JAXBElement<CorrelationInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.17", "CorrelationInformation");

    public CorrelationInformation(CorrelationInformationType value) {
        super(NAME, ((Class) CorrelationInformationType.class), null, value);
    }

    public CorrelationInformation() {
        super(NAME, ((Class) CorrelationInformationType.class), null, null);
    }

}
