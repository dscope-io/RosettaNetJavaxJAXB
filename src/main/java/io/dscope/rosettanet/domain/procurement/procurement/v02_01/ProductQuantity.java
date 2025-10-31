
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductQuantity
    extends JAXBElement<Float>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "ProductQuantity");

    public ProductQuantity(Float value) {
        super(NAME, ((Class) Float.class), null, value);
    }

    public ProductQuantity() {
        super(NAME, ((Class) Float.class), null, null);
    }

}
