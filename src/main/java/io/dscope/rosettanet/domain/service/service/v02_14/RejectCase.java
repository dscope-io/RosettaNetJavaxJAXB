
package io.dscope.rosettanet.domain.service.service.v02_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RejectCase
    extends JAXBElement<RejectCaseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.14", "RejectCase");

    public RejectCase(RejectCaseType value) {
        super(NAME, ((Class) RejectCaseType.class), null, value);
    }

    public RejectCase() {
        super(NAME, ((Class) RejectCaseType.class), null, null);
    }

}
