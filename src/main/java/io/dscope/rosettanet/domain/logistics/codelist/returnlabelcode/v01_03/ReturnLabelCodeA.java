
package io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnLabelCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.03", "ReturnLabelCodeA");

    public ReturnLabelCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReturnLabelCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
