
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReferenceDesignators
    extends JAXBElement<ReferenceDesignatorsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "ReferenceDesignators");

    public ReferenceDesignators(ReferenceDesignatorsType value) {
        super(NAME, ((Class) ReferenceDesignatorsType.class), null, value);
    }

    public ReferenceDesignators() {
        super(NAME, ((Class) ReferenceDesignatorsType.class), null, null);
    }

}
