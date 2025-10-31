
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContractInformation
    extends JAXBElement<ContractInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "ContractInformation");

    public ContractInformation(ContractInformationType value) {
        super(NAME, ((Class) ContractInformationType.class), null, value);
    }

    public ContractInformation() {
        super(NAME, ((Class) ContractInformationType.class), null, null);
    }

}
