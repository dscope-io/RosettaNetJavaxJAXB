
package io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxExemptionCode
    extends JAXBElement<TaxExemptionCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.03", "TaxExemptionCode");

    public TaxExemptionCode(TaxExemptionCodeType value) {
        super(NAME, ((Class) TaxExemptionCodeType.class), null, value);
    }

    public TaxExemptionCode() {
        super(NAME, ((Class) TaxExemptionCodeType.class), null, null);
    }

}
