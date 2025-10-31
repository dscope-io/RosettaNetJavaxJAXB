
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsPriceProtect
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "IsPriceProtect");

    public IsPriceProtect(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsPriceProtect() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
