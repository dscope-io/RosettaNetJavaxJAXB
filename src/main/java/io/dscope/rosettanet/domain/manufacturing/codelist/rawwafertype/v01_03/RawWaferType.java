
package io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RawWaferType
    extends JAXBElement<RawWaferTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03", "RawWaferType");

    public RawWaferType(RawWaferTypeType value) {
        super(NAME, ((Class) RawWaferTypeType.class), null, value);
    }

    public RawWaferType() {
        super(NAME, ((Class) RawWaferTypeType.class), null, null);
    }

}
