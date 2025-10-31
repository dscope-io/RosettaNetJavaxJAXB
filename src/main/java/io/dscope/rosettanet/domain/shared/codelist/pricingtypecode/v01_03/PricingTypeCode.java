
package io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PricingTypeCode
    extends JAXBElement<PricingTypeCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03", "PricingTypeCode");

    public PricingTypeCode(PricingTypeCodeType value) {
        super(NAME, ((Class) PricingTypeCodeType.class), null, value);
    }

    public PricingTypeCode() {
        super(NAME, ((Class) PricingTypeCodeType.class), null, null);
    }

}
