
package io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ConfirmationType
    extends JAXBElement<ConfirmationTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03", "ConfirmationType");

    public ConfirmationType(ConfirmationTypeType value) {
        super(NAME, ((Class) ConfirmationTypeType.class), null, value);
    }

    public ConfirmationType() {
        super(NAME, ((Class) ConfirmationTypeType.class), null, null);
    }

}
