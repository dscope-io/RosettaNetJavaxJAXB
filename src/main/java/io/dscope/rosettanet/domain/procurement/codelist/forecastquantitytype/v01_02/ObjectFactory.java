
package io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_02 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForecastQuantityTypeType }
     * 
     */
    public ForecastQuantityTypeType createForecastQuantityTypeType() {
        return new ForecastQuantityTypeType();
    }

    /**
     * Create an instance of {@link ForecastQuantityTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastQuantityTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.02", name = "ForecastQuantityTypeA")
    public ForecastQuantityTypeA createForecastQuantityTypeA(Object value) {
        return new ForecastQuantityTypeA(value);
    }

    /**
     * Create an instance of {@link ForecastQuantityType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastQuantityType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.02", name = "ForecastQuantityType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.02", substitutionHeadName = "ForecastQuantityTypeA")
    public ForecastQuantityType createForecastQuantityType(ForecastQuantityTypeType value) {
        return new ForecastQuantityType(value);
    }

}
