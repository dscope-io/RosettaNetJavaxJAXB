
package io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UnitOfMeasureA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", "UnitOfMeasureA");

    public UnitOfMeasureA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public UnitOfMeasureA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
