
package io.dscope.rosettanet.system.codelist.tpirfiletype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TPIRFileType
    extends JAXBElement<TPIRFileTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.00", "TPIRFileType");

    public TPIRFileType(TPIRFileTypeType value) {
        super(NAME, ((Class) TPIRFileTypeType.class), null, value);
    }

    public TPIRFileType() {
        super(NAME, ((Class) TPIRFileTypeType.class), null, null);
    }

}
