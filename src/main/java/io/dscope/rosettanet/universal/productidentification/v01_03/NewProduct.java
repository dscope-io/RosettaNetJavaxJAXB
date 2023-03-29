
package io.dscope.rosettanet.universal.productidentification.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NewProduct
    extends JAXBElement<NewProductType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", "NewProduct");

    public NewProduct(NewProductType value) {
        super(NAME, ((Class) NewProductType.class), null, value);
    }

    public NewProduct() {
        super(NAME, ((Class) NewProductType.class), null, null);
    }

}
