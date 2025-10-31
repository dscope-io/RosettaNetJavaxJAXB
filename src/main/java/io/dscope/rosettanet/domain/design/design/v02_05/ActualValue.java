
package io.dscope.rosettanet.domain.design.design.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActualValue
    extends JAXBElement<ActualValueType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.05", "ActualValue");

    public ActualValue(ActualValueType value) {
        super(NAME, ((Class) ActualValueType.class), null, value);
    }

    public ActualValue() {
        super(NAME, ((Class) ActualValueType.class), null, null);
    }

}
