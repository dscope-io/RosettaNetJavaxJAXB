
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomerInformation
    extends JAXBElement<CustomerInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "CustomerInformation");

    public CustomerInformation(CustomerInformationType value) {
        super(NAME, ((Class) CustomerInformationType.class), null, value);
    }

    public CustomerInformation() {
        super(NAME, ((Class) CustomerInformationType.class), null, null);
    }

}