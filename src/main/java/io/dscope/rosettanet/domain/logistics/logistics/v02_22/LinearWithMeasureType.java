
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LinearWithMeasureType
    extends JAXBElement<LinearWithMeasureTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", "LinearWithMeasureType");

    public LinearWithMeasureType(LinearWithMeasureTypeType value) {
        super(NAME, ((Class) LinearWithMeasureTypeType.class), null, value);
    }

    public LinearWithMeasureType() {
        super(NAME, ((Class) LinearWithMeasureTypeType.class), null, null);
    }

}
