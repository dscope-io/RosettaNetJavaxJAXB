
package io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Confidentiality
    extends JAXBElement<ConfidentialityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:1.0", "Confidentiality");

    public Confidentiality(ConfidentialityType value) {
        super(NAME, ((Class) ConfidentialityType.class), null, value);
    }

    public Confidentiality() {
        super(NAME, ((Class) ConfidentialityType.class), null, null);
    }

}
