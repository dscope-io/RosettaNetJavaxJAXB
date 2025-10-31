
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessInformation
    extends JAXBElement<ProcessInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", "ProcessInformation");

    public ProcessInformation(ProcessInformationType value) {
        super(NAME, ((Class) ProcessInformationType.class), null, value);
    }

    public ProcessInformation() {
        super(NAME, ((Class) ProcessInformationType.class), null, null);
    }

}
