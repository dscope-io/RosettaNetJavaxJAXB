
package io.dscope.rosettanet.domain.logistics.codelist.packagetype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackageType
    extends JAXBElement<PackageTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PackageType:xsd:codelist:01.02", "PackageType");

    public PackageType(PackageTypeType value) {
        super(NAME, ((Class) PackageTypeType.class), null, value);
    }

    public PackageType() {
        super(NAME, ((Class) PackageTypeType.class), null, null);
    }

}
