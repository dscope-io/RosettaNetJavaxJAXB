
package io.dscope.rosettanet.domain.manufacturing.codelist.waferpassivation.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferPassivationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferPassivation:xsd:codelist:1.0", "WaferPassivationA");

    public WaferPassivationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WaferPassivationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
