
package io.dscope.rosettanet.interchange.certificateofanalysisresponsenotification.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.certificateofanalysisresponsenotification.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.certificateofanalysisresponsenotification.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisResponseNotificationType }
     * 
     */
    public CertificateOfAnalysisResponseNotificationType createCertificateOfAnalysisResponseNotificationType() {
        return new CertificateOfAnalysisResponseNotificationType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisResponseType }
     * 
     */
    public CertificateOfAnalysisResponseType createCertificateOfAnalysisResponseType() {
        return new CertificateOfAnalysisResponseType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisResponseNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CertificateOfAnalysisResponseNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:CertificateOfAnalysisResponseNotification:xsd:schema:01.02", name = "CertificateOfAnalysisResponseNotification")
    public CertificateOfAnalysisResponseNotification createCertificateOfAnalysisResponseNotification(CertificateOfAnalysisResponseNotificationType value) {
        return new CertificateOfAnalysisResponseNotification(value);
    }

}
