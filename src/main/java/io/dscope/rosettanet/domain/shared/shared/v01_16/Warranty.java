
package io.dscope.rosettanet.domain.shared.shared.v01_16;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Warranty
    extends JAXBElement<WarrantyType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.16", "Warranty");

    public Warranty(WarrantyType value) {
        super(NAME, ((Class) WarrantyType.class), null, value);
    }

    public Warranty() {
        super(NAME, ((Class) WarrantyType.class), null, null);
    }

}
