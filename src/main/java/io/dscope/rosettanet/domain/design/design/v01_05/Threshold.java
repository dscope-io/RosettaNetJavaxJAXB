
package io.dscope.rosettanet.domain.design.design.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Threshold
    extends JAXBElement<ThresholdType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.05", "Threshold");

    public Threshold(ThresholdType value) {
        super(NAME, ((Class) ThresholdType.class), null, value);
    }

    public Threshold() {
        super(NAME, ((Class) ThresholdType.class), null, null);
    }

}
