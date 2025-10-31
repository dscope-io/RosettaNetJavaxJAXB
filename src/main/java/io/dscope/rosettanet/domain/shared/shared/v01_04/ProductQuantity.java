
package io.dscope.rosettanet.domain.shared.shared.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductQuantity
    extends JAXBElement<Float>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", "ProductQuantity");

    public ProductQuantity(Float value) {
        super(NAME, ((Class) Float.class), null, value);
    }

    public ProductQuantity() {
        super(NAME, ((Class) Float.class), null, null);
    }

}
