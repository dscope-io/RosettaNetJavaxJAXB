
package io.dscope.rosettanet.domain.service.service.v02_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CaseID
    extends JAXBElement<CaseIDType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "CaseID");

    public CaseID(CaseIDType value) {
        super(NAME, ((Class) CaseIDType.class), null, value);
    }

    public CaseID() {
        super(NAME, ((Class) CaseIDType.class), null, null);
    }

}
