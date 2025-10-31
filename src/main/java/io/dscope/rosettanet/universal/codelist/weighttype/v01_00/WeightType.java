
package io.dscope.rosettanet.universal.codelist.weighttype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WeightType
    extends JAXBElement<WeightTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.00", "WeightType");

    public WeightType(WeightTypeType value) {
        super(NAME, ((Class) WeightTypeType.class), null, value);
    }

    public WeightType() {
        super(NAME, ((Class) WeightTypeType.class), null, null);
    }

}
