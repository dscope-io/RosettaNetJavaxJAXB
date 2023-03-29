
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsCostChange
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", "IsCostChange");

    public IsCostChange(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsCostChange() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}