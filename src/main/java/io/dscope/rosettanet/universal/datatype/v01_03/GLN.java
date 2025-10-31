
package io.dscope.rosettanet.universal.datatype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GLN
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", "GLN");

    public GLN(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public GLN() {
        super(NAME, ((Class) String.class), null, null);
    }

}
