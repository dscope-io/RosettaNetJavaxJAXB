
package io.dscope.rosettanet.domain.logistics.codelist.packagetype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackageTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PackageType:xsd:codelist:01.02", "PackageTypeA");

    public PackageTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PackageTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
