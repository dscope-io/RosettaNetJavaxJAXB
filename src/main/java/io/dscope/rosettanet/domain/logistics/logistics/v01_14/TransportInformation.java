
package io.dscope.rosettanet.domain.logistics.logistics.v01_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransportInformation
    extends JAXBElement<TransportInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.14", "TransportInformation");

    public TransportInformation(TransportInformationType value) {
        super(NAME, ((Class) TransportInformationType.class), null, value);
    }

    public TransportInformation() {
        super(NAME, ((Class) TransportInformationType.class), null, null);
    }

}
