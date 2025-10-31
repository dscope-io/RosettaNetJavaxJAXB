
package io.dscope.rosettanet.domain.design.codelist.assemblylevelcode.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AssemblyLevelCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.00", "AssemblyLevelCodeA");

    public AssemblyLevelCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public AssemblyLevelCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
