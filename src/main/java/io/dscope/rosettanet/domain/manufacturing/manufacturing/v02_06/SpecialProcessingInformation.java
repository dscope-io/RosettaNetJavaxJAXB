
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialProcessingInformation
    extends JAXBElement<SpecialProcessingInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06", "SpecialProcessingInformation");

    public SpecialProcessingInformation(SpecialProcessingInformationType value) {
        super(NAME, ((Class) SpecialProcessingInformationType.class), null, value);
    }

    public SpecialProcessingInformation() {
        super(NAME, ((Class) SpecialProcessingInformationType.class), null, null);
    }

}
