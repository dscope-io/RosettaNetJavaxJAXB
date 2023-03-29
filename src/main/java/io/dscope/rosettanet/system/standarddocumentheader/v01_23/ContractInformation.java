
package io.dscope.rosettanet.system.standarddocumentheader.v01_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContractInformation
    extends JAXBElement<ContractInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", "ContractInformation");

    public ContractInformation(ContractInformationType value) {
        super(NAME, ((Class) ContractInformationType.class), null, value);
    }

    public ContractInformation() {
        super(NAME, ((Class) ContractInformationType.class), null, null);
    }

}
