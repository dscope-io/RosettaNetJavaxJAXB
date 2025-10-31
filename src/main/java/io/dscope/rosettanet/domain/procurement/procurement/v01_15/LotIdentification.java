
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotIdentification
    extends JAXBElement<LotIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "LotIdentification");

    public LotIdentification(LotIdentificationType value) {
        super(NAME, ((Class) LotIdentificationType.class), null, value);
    }

    public LotIdentification() {
        super(NAME, ((Class) LotIdentificationType.class), null, null);
    }

}
