
package io.dscope.rosettanet.universal.codelist.country.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Country
    extends JAXBElement<CountryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Country:xsd:codelist:1.0", "Country");

    public Country(CountryType value) {
        super(NAME, ((Class) CountryType.class), null, value);
    }

    public Country() {
        super(NAME, ((Class) CountryType.class), null, null);
    }

}
