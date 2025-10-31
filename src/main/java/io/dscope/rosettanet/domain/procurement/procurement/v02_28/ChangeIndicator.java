
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChangeIndicator
    extends JAXBElement<ChangeIndicatorType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "ChangeIndicator");

    public ChangeIndicator(ChangeIndicatorType value) {
        super(NAME, ((Class) ChangeIndicatorType.class), null, value);
    }

    public ChangeIndicator() {
        super(NAME, ((Class) ChangeIndicatorType.class), null, null);
    }

}
