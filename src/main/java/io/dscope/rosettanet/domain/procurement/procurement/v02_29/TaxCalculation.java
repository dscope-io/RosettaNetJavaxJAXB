
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxCalculation
    extends JAXBElement<TaxCalculationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", "TaxCalculation");

    public TaxCalculation(TaxCalculationType value) {
        super(NAME, ((Class) TaxCalculationType.class), null, value);
    }

    public TaxCalculation() {
        super(NAME, ((Class) TaxCalculationType.class), null, null);
    }

}
