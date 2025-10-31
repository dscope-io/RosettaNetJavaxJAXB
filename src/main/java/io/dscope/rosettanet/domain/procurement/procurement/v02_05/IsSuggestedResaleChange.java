
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsSuggestedResaleChange
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "IsSuggestedResaleChange");

    public IsSuggestedResaleChange(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsSuggestedResaleChange() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
