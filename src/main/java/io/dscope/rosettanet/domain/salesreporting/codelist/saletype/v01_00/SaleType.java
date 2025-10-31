
package io.dscope.rosettanet.domain.salesreporting.codelist.saletype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SaleType
    extends JAXBElement<SaleTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:SaleType:xsd:codelist:1.0", "SaleType");

    public SaleType(SaleTypeType value) {
        super(NAME, ((Class) SaleTypeType.class), null, value);
    }

    public SaleType() {
        super(NAME, ((Class) SaleTypeType.class), null, null);
    }

}
