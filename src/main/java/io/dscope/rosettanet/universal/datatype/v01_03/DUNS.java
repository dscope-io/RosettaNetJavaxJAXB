
package io.dscope.rosettanet.universal.datatype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DUNS
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", "DUNS");

    public DUNS(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public DUNS() {
        super(NAME, ((Class) String.class), null, null);
    }

}
