
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContractDetails
    extends JAXBElement<ContractDetailsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", "ContractDetails");

    public ContractDetails(ContractDetailsType value) {
        super(NAME, ((Class) ContractDetailsType.class), null, value);
    }

    public ContractDetails() {
        super(NAME, ((Class) ContractDetailsType.class), null, null);
    }

}
