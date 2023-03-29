
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MeasureWithType
    extends JAXBElement<MeasureWithTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", "MeasureWithType");

    public MeasureWithType(MeasureWithTypeType value) {
        super(NAME, ((Class) MeasureWithTypeType.class), null, value);
    }

    public MeasureWithType() {
        super(NAME, ((Class) MeasureWithTypeType.class), null, null);
    }

}