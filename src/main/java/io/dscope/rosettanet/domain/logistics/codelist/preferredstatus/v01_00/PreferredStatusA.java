
package io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PreferredStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:01.00", "PreferredStatusA");

    public PreferredStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PreferredStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
