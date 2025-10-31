
package io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UnitOfMeasure
    extends JAXBElement<UnitOfMeasureType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02", "UnitOfMeasure");

    public UnitOfMeasure(UnitOfMeasureType value) {
        super(NAME, ((Class) UnitOfMeasureType.class), null, value);
    }

    public UnitOfMeasure() {
        super(NAME, ((Class) UnitOfMeasureType.class), null, null);
    }

}
