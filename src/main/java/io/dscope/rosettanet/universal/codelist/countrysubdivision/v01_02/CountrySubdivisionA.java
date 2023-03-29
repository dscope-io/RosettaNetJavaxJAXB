
package io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CountrySubdivisionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:01.02", "CountrySubdivisionA");

    public CountrySubdivisionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CountrySubdivisionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
