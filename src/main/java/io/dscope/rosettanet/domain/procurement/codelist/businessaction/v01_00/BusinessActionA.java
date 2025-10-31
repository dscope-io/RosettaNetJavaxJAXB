
package io.dscope.rosettanet.domain.procurement.codelist.businessaction.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BusinessActionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:BusinessAction:xsd:codelist:1.0", "BusinessActionA");

    public BusinessActionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public BusinessActionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
