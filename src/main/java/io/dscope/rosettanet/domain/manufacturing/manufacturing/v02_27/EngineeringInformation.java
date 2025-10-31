
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class EngineeringInformation
    extends JAXBElement<EngineeringInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "EngineeringInformation");

    public EngineeringInformation(EngineeringInformationType value) {
        super(NAME, ((Class) EngineeringInformationType.class), null, value);
    }

    public EngineeringInformation() {
        super(NAME, ((Class) EngineeringInformationType.class), null, null);
    }

}
