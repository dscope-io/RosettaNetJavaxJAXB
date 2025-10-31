
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsPartSelected
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "IsPartSelected");

    public IsPartSelected(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsPartSelected() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
