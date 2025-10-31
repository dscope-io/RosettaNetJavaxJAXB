
package io.dscope.rosettanet.universal.monetaryexpression.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxJurisdiction
    extends JAXBElement<TaxJurisdictionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.01", "TaxJurisdiction");

    public TaxJurisdiction(TaxJurisdictionType value) {
        super(NAME, ((Class) TaxJurisdictionType.class), null, value);
    }

    public TaxJurisdiction() {
        super(NAME, ((Class) TaxJurisdictionType.class), null, null);
    }

}
