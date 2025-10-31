
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxInformation
    extends JAXBElement<TaxInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", "TaxInformation");

    public TaxInformation(TaxInformationType value) {
        super(NAME, ((Class) TaxInformationType.class), null, value);
    }

    public TaxInformation() {
        super(NAME, ((Class) TaxInformationType.class), null, null);
    }

}
