
package io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxExemptionCode
    extends JAXBElement<TaxExemptionCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:1.0", "TaxExemptionCode");

    public TaxExemptionCode(TaxExemptionCodeType value) {
        super(NAME, ((Class) TaxExemptionCodeType.class), null, value);
    }

    public TaxExemptionCode() {
        super(NAME, ((Class) TaxExemptionCodeType.class), null, null);
    }

}
