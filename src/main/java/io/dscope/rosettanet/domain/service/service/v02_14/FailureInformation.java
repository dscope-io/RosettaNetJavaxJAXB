
package io.dscope.rosettanet.domain.service.service.v02_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureInformation
    extends JAXBElement<FailureInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.14", "FailureInformation");

    public FailureInformation(FailureInformationType value) {
        super(NAME, ((Class) FailureInformationType.class), null, value);
    }

    public FailureInformation() {
        super(NAME, ((Class) FailureInformationType.class), null, null);
    }

}
