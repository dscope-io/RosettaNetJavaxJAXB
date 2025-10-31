
package io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ThresholdReleaseForecastNotificationType }
     * 
     */
    public ThresholdReleaseForecastNotificationType createThresholdReleaseForecastNotificationType() {
        return new ThresholdReleaseForecastNotificationType();
    }

    /**
     * Create an instance of {@link PartnerProductForecastType }
     * 
     */
    public PartnerProductForecastType createPartnerProductForecastType() {
        return new PartnerProductForecastType();
    }

    /**
     * Create an instance of {@link ProductForecastInformationType }
     * 
     */
    public ProductForecastInformationType createProductForecastInformationType() {
        return new ProductForecastInformationType();
    }

    /**
     * Create an instance of {@link ProductScheduleType }
     * 
     */
    public ProductScheduleType createProductScheduleType() {
        return new ProductScheduleType();
    }

    /**
     * Create an instance of {@link ThresholdReleaseForecastType }
     * 
     */
    public ThresholdReleaseForecastType createThresholdReleaseForecastType() {
        return new ThresholdReleaseForecastType();
    }

    /**
     * Create an instance of {@link ThresholdReleaseForecastNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ThresholdReleaseForecastNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ThresholdReleaseForecastNotification:xsd:schema:02.01", name = "ThresholdReleaseForecastNotification")
    public ThresholdReleaseForecastNotification createThresholdReleaseForecastNotification(ThresholdReleaseForecastNotificationType value) {
        return new ThresholdReleaseForecastNotification(value);
    }

}
