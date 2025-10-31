
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MeasureWithType
    extends JAXBElement<MeasureWithTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", "MeasureWithType");

    public MeasureWithType(MeasureWithTypeType value) {
        super(NAME, ((Class) MeasureWithTypeType.class), null, value);
    }

    public MeasureWithType() {
        super(NAME, ((Class) MeasureWithTypeType.class), null, null);
    }

}
