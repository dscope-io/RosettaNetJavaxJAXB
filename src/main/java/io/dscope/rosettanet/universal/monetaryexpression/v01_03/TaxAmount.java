
package io.dscope.rosettanet.universal.monetaryexpression.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxAmount
    extends JAXBElement<TaxAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03", "TaxAmount");

    public TaxAmount(TaxAmountType value) {
        super(NAME, ((Class) TaxAmountType.class), null, value);
    }

    public TaxAmount() {
        super(NAME, ((Class) TaxAmountType.class), null, null);
    }

}
