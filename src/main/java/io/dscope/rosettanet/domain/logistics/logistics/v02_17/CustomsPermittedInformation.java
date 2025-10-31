
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomsPermittedInformation
    extends JAXBElement<CustomsPermittedInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", "CustomsPermittedInformation");

    public CustomsPermittedInformation(CustomsPermittedInformationType value) {
        super(NAME, ((Class) CustomsPermittedInformationType.class), null, value);
    }

    public CustomsPermittedInformation() {
        super(NAME, ((Class) CustomsPermittedInformationType.class), null, null);
    }

}
