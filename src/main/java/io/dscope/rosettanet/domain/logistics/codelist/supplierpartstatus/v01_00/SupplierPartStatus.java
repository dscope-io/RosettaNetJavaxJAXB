
package io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SupplierPartStatus
    extends JAXBElement<SupplierPartStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:01.00", "SupplierPartStatus");

    public SupplierPartStatus(SupplierPartStatusType value) {
        super(NAME, ((Class) SupplierPartStatusType.class), null, value);
    }

    public SupplierPartStatus() {
        super(NAME, ((Class) SupplierPartStatusType.class), null, null);
    }

}
