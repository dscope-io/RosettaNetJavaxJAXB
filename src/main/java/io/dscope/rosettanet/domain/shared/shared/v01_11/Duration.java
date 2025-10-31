
package io.dscope.rosettanet.domain.shared.shared.v01_11;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Duration
    extends JAXBElement<DurationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.11", "Duration");

    public Duration(DurationType value) {
        super(NAME, ((Class) DurationType.class), null, value);
    }

    public Duration() {
        super(NAME, ((Class) DurationType.class), null, null);
    }

}
