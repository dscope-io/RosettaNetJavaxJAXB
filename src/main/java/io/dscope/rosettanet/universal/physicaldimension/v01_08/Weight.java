
package io.dscope.rosettanet.universal.physicaldimension.v01_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Weight
    extends JAXBElement<WeightType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.08", "Weight");

    public Weight(WeightType value) {
        super(NAME, ((Class) WeightType.class), null, value);
    }

    public Weight() {
        super(NAME, ((Class) WeightType.class), null, null);
    }

}
