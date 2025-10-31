package io.dscope.rosettanet.test;

import static org.assertj.core.api.Assertions.assertThat;

import io.dscope.rosettanet.dictionary.RosettaNetDictionary;
import io.dscope.rosettanet.dictionary.RosettaNetDictionary.MessageDefinition;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Stream;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RosettaNetPIPTest {

    @ParameterizedTest(name = "{0} {1} {2}")
    @MethodSource("pipPayloads")
    void roundTripRosettaNetMessage(String pipType, String messageVersion, String messageName, Path samplePath) throws Exception {
        MessageDefinition definition = resolveMessageDefinition(pipType, messageVersion, messageName);
        JAXBContext context = createJaxbContext(definition);

        String samplePayload = readSample(samplePath);

        JAXBElement<?> element = unmarshalPayload(context, samplePayload);
        Class<?> expectedElementClass = resolveMessageClass(definition);
        Class<?> expectedValueClass = resolveMessageValueClass(definition);
        assertThat(element.getName().getLocalPart())
            .as("Unmarshalled element name should match %s", messageName)
            .isEqualTo(messageName);
        Object payload = element.getValue();
        assertThat(payload)
            .as("Unmarshalled payload should provide a value for %s", messageName)
            .isNotNull();
        assertThat(element)
            .as("Unmarshalled element should be %s", expectedElementClass.getName())
            .isInstanceOf(expectedElementClass);
        assertThat(element.getDeclaredType())
            .as("JAXB element declared type should be %s", expectedValueClass.getName())
            .isEqualTo(expectedValueClass);
        assertThat(payload)
            .as("Unmarshalled value should be an instance of %s", expectedValueClass.getName())
            .isInstanceOf(expectedValueClass);

        String marshalled = marshalPayload(context, element);
        assertThat(marshalled)
            .as("Marshalled XML should contain the %s root element", messageName)
            .contains(messageName);
    }

    private static Stream<Arguments> pipPayloads() {
        return Stream.of(
            // PIP3A2
            Arguments.of(
                "PIP3A2",
                "02_00",
                "PriceAndAvailabilityRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A2_V11.00.00_RequestPriceAndAvailability",
                    "Descriptive",
                    "PriceAndAvailabilityRequest",
                    "PriceAndAvailabilityRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A2",
                "02_00",
                "PriceAndAvailabilityResponse",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A2_V11.00.00_RequestPriceAndAvailability",
                    "Descriptive",
                    "PriceAndAvailabilityRequest",
                    "PriceAndAvailabilityResponse.xml"
                )
            ),
            Arguments.of(
                "PIP3A2",
                "02_00",
                "PriceAndAvailabilityRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A2_V11.00.01_RequestPriceAndAvailability",
                    "Descriptive",
                    "PriceAndAvailabilityRequest",
                    "PriceAndAvailabilityRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A2",
                "02_00",
                "PriceAndAvailabilityResponse",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A2_V11.00.01_RequestPriceAndAvailability",
                    "Descriptive",
                    "PriceAndAvailabilityRequest",
                    "PriceAndAvailabilityResponse.xml"
                )
            ),
            Arguments.of(
                "PIP3A2",
                "02_01",
                "PriceAndAvailabilityRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A2_V11.01.00_RequestPriceAndAvailability",
                    "Descriptive",
                    "PriceAndAvailabilityRequest",
                    "PriceAndAvailabilityRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A2",
                "02_01",
                "PriceAndAvailabilityResponse",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A2_V11.01.00_RequestPriceAndAvailability",
                    "Descriptive",
                    "PriceAndAvailabilityResponse",
                    "PriceAndAvailabilityResponse.xml"
                )
            ),
            // PIP3A20
            Arguments.of(
                "PIP3A20",
                "01_00",
                "PurchaseOrderConfirmation",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A20_V11.00.00_NotifyOfPurchaseOrderConfirmation",
                    "Descriptive",
                    "PurchaseOrderConfirmation",
                    "PurchaseOrderConfirmationNotification.xml"
                )
            ),
            // PIP3A4
            Arguments.of(
                "PIP3A4",
                "02_00",
                "PurchaseOrderRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.10.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_00",
                "PurchaseOrderConfirmation",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.10.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderConfirmation.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_01",
                "PurchaseOrderRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.11.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_01",
                "PurchaseOrderConfirmation",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.11.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderConfirmation.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_04",
                "PurchaseOrderRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.13.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_04",
                "PurchaseOrderConfirmation",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.13.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderConfirmation.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_05",
                "PurchaseOrderRequest",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.14.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderRequest",
                    "PurchaseOrderRequest.xml"
                )
            ),
            Arguments.of(
                "PIP3A4",
                "02_05",
                "PurchaseOrderConfirmation",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3A4_V11.14.00_RequestPurchaseOrder",
                    "Descriptive",
                    "PurchaseOrderConfirmation",
                    "PurchaseOrderConfirmation.xml"
                )
            ),
            // PIP3B2
            Arguments.of(
                "PIP3B2",
                "02_01",
                "AdvanceShipmentNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3B2_V11.00.00_NotifyOfAdvanceShipment",
                    "Descriptive",
                    "AdvanceShipmentNotification",
                    "AdvanceShipmentNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3B2",
                "02_04",
                "AdvanceShipmentNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3B2_V11.01.00_NotifyOfAdvanceShipment",
                    "Descriptive",
                    "AdvanceShipmentNotification",
                    "AdvanceShipmentNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3B2",
                "02_04",
                "AdvanceShipmentNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3B2_V11.02.00_NotifyOfAdvanceShipment",
                    "Descriptive",
                    "AdvanceShipmentNotification",
                    "AdvanceShipmentNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3B2",
                "02_05",
                "AdvanceShipmentNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3B2_V11.03.00_NotifyOfAdvanceShipment",
                    "Descriptive",
                    "AdvanceShipmentNotification",
                    "AdvanceShipmentNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3B2",
                "02_06",
                "AdvanceShipmentNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3B2_V11.04.00_NotifyOfAdvanceShipment",
                    "Descriptive",
                    "AdvanceShipmentNotification",
                    "AdvanceShipmentNotification.xml"
                )
            ),
            // PIP4B2
            Arguments.of(
                "PIP4B2",
                "02_01",
                "ShipmentReceiptNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP4B2_V11.00.00_NotifyOfShipmentReceipt",
                    "Descriptive",
                    "ShipmentReceiptNotification",
                    "ShipmentReceiptNotification.xml"
                )
            ),
            Arguments.of(
                "PIP4B2",
                "02_01",
                "ShipmentReceiptNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP4B2_V11.00.01_NotifyOfShipmentReceipt",
                    "Descriptive",
                    "ShipmentReceiptNotification",
                    "ShipmentReceiptNotification.xml"
                )
            ),
            Arguments.of(
                "PIP4B2",
                "02_02",
                "ShipmentReceiptNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP4B2_V11.01.00_NotifyOfShipmentReceipt",
                    "Descriptive",
                    "ShipmentReceiptNotification",
                    "ShipmentReceiptNotification.xml"
                )
            ),
            // PIP3C3
            Arguments.of(
                "PIP3C3",
                "01_07",
                "InvoiceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C3_V11.00.00_NotifyOfInvoice",
                    "Descriptive",
                    "InvoiceNotification",
                    "InvoiceNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C3",
                "01_08",
                "InvoiceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C3_V11.01.00_NotifyOfInvoice",
                    "Descriptive",
                    "InvoiceNotification",
                    "InvoiceNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C3",
                "02_00",
                "InvoiceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C3_V11.02.00_NotifyOfInvoice",
                    "Descriptive",
                    "InvoiceNotification",
                    "InvoiceNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C3",
                "02_01",
                "InvoiceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C3_V11.03.00_NotifyOfInvoice",
                    "Descriptive",
                    "InvoiceNotification",
                    "InvoiceNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C3",
                "02_05",
                "InvoiceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C3_V11.04.00_NotifyOfInvoice",
                    "Descriptive",
                    "InvoiceNotification",
                    "InvoiceNotification.xml"
                )
            ),
            // PIP3C4
            Arguments.of(
                "PIP3C4",
                "01_04",
                "InvoiceRejectNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C4_V11.00.00_NotifyOfInvoiceReject",
                    "Descriptive",
                    "InvoiceRejectNotification",
                    "InvoiceRejectNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C4",
                "02_00",
                "InvoiceRejectNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C4_V11.02.00_NotifyOfInvoiceReject",
                    "Descriptive",
                    "InvoiceRejectNotification",
                    "InvoiceRejectNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C4",
                "02_01",
                "InvoiceRejectNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C4_V11.03.00_NotifyOfInvoiceReject",
                    "Descriptive",
                    "InvoiceRejectNotification",
                    "InvoiceRejectNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C4",
                "02_02",
                "InvoiceRejectNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C4_V11.04.00_NotifyOfInvoiceReject",
                    "Descriptive",
                    "InvoiceRejectNotification",
                    "InvoiceRejectNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C4",
                "02_03",
                "InvoiceRejectNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C4_V11.05.00_NotifyOfInvoiceReject",
                    "Descriptive",
                    "InvoiceRejectNotification",
                    "InvoiceRejectNotification.xml"
                )
            ),
            // PIP3C6
            Arguments.of(
                "PIP3C6",
                "02_01",
                "RemittanceAdviceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C6_V11.01.00_NotifyOfRemittanceAdvice",
                    "Descriptive",
                    "RemittanceAdviceNotification",
                    "RemittanceAdviceNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C6",
                "02_02",
                "RemittanceAdviceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C6_V11.02.00_NotifyOfRemittanceAdvice",
                    "Descriptive",
                    "RemittanceAdviceNotification",
                    "RemittanceAdviceNotification.xml"
                )
            ),
            Arguments.of(
                "PIP3C6",
                "02_04",
                "RemittanceAdviceNotification",
                Paths.get(
                    "src",
                    "main",
                    "xsd",
                    "PIP3C6_V11.03.00_NotifyOfRemittanceAdvice",
                    "Descriptive",
                    "RemittanceAdviceNotification",
                    "RemittanceAdviceNotification.xml"
                )
            )
        );
    }

    private MessageDefinition resolveMessageDefinition(String pipType, String messageVersion, String messageName) {
        Optional<MessageDefinition> definition = RosettaNetDictionary.findMessage(pipType, messageVersion, messageName);
        assertThat(definition)
            .as("Dictionary should locate %s version %s (%s)", pipType, messageVersion, messageName)
            .isPresent();
        return definition.get();
    }

    private JAXBContext createJaxbContext(MessageDefinition definition) throws JAXBException {
        Properties properties = RosettaNetDictionary.loadProperties(definition.getProperties());
        String contextPath = properties.getProperty("packages");

        assertThat(contextPath)
            .as("RosettaNet properties should declare JAXB packages for %s", definition.getType())
            .isNotBlank();
        assertThat(contextPath)
            .as("JAXB package list should include the message package %s", definition.getPackageName())
            .contains(definition.getPackageName());

        JAXBContext context = JAXBContext.newInstance(contextPath.trim());
        assertThat(context).isNotNull();
        JAXBElement<?> rootElement = instantiateRootElement(definition);
        assertThat(context.createJAXBIntrospector().isElement(rootElement))
            .as("Context should recognise %s element", definition.getName())
            .isTrue();
        return context;
    }

    private JAXBElement<?> unmarshalPayload(JAXBContext jaxbContext, String xmlPayload) throws JAXBException {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object unmarshalled = unmarshaller.unmarshal(new StreamSource(new java.io.StringReader(xmlPayload)));
        assertThat(unmarshalled)
            .as("JAXB unmarshal result should be a JAXBElement")
            .isInstanceOf(JAXBElement.class);
        return (JAXBElement<?>) unmarshalled;
    }

    private String marshalPayload(JAXBContext jaxbContext, JAXBElement<?> jaxbElement) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();
        marshaller.marshal(jaxbElement, writer);
        return writer.toString();
    }

    private JAXBElement<?> instantiateRootElement(MessageDefinition definition) {
        try {
            Class<?> elementClass = resolveMessageClass(definition);
            return (JAXBElement<?>) elementClass.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                 | NoSuchMethodException | InvocationTargetException ex) {
            throw new IllegalStateException("Unable to instantiate JAXB element for " + definition.getName(), ex);
        }
    }

    private Class<?> resolveMessageClass(MessageDefinition definition) throws ClassNotFoundException {
        return Class.forName(definition.getPackageName() + "." + definition.getName());
    }

    private Class<?> resolveMessageValueClass(MessageDefinition definition) {
        JAXBElement<?> element = instantiateRootElement(definition);
        return element.getDeclaredType();
    }

    private String readSample(Path samplePath) throws IOException {
        Path absolute = samplePath.toAbsolutePath();
        if (!Files.exists(absolute)) {
            throw new IOException("Sample resource not found: " + absolute);
        }
        return new String(Files.readAllBytes(absolute), StandardCharsets.UTF_8);
    }
}
