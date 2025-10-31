
package io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestResultType }
     * 
     */
    public TestResultType createTestResultType() {
        return new TestResultType();
    }

    /**
     * Create an instance of {@link TestResultA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TestResultA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:1.0", name = "TestResultA")
    public TestResultA createTestResultA(Object value) {
        return new TestResultA(value);
    }

    /**
     * Create an instance of {@link TestResult }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TestResult }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:1.0", name = "TestResult", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:1.0", substitutionHeadName = "TestResultA")
    public TestResult createTestResult(TestResultType value) {
        return new TestResult(value);
    }

}
