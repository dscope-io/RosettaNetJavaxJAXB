
package io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PreferredStatus
    extends JAXBElement<PreferredStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:01.00", "PreferredStatus");

    public PreferredStatus(PreferredStatusType value) {
        super(NAME, ((Class) PreferredStatusType.class), null, value);
    }

    public PreferredStatus() {
        super(NAME, ((Class) PreferredStatusType.class), null, null);
    }

}
