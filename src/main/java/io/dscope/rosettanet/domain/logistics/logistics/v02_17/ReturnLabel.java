
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnLabel
    extends JAXBElement<ReturnLabelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", "ReturnLabel");

    public ReturnLabel(ReturnLabelType value) {
        super(NAME, ((Class) ReturnLabelType.class), null, value);
    }

    public ReturnLabel() {
        super(NAME, ((Class) ReturnLabelType.class), null, null);
    }

}
