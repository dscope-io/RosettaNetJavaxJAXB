
package io.dscope.rosettanet.domain.procurement.codelist.businessaction.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BusinessAction
    extends JAXBElement<BusinessActionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:BusinessAction:xsd:codelist:01.03", "BusinessAction");

    public BusinessAction(BusinessActionType value) {
        super(NAME, ((Class) BusinessActionType.class), null, value);
    }

    public BusinessAction() {
        super(NAME, ((Class) BusinessActionType.class), null, null);
    }

}