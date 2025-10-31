
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortalAccess
    extends JAXBElement<PortalAccessType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "PortalAccess");

    public PortalAccess(PortalAccessType value) {
        super(NAME, ((Class) PortalAccessType.class), null, value);
    }

    public PortalAccess() {
        super(NAME, ((Class) PortalAccessType.class), null, null);
    }

}
