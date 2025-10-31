
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsHazardousMaterial
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "IsHazardousMaterial");

    public IsHazardousMaterial(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsHazardousMaterial() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
