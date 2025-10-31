
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityDetail
    extends JAXBElement<QuantityDetailType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06", "QuantityDetail");

    public QuantityDetail(QuantityDetailType value) {
        super(NAME, ((Class) QuantityDetailType.class), null, value);
    }

    public QuantityDetail() {
        super(NAME, ((Class) QuantityDetailType.class), null, null);
    }

}
