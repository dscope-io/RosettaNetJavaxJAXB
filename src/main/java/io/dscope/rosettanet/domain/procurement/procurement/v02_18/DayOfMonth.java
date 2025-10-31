
package io.dscope.rosettanet.domain.procurement.procurement.v02_18;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DayOfMonth
    extends JAXBElement<BigInteger>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", "DayOfMonth");

    public DayOfMonth(BigInteger value) {
        super(NAME, ((Class) BigInteger.class), null, value);
    }

    public DayOfMonth() {
        super(NAME, ((Class) BigInteger.class), null, null);
    }

}
