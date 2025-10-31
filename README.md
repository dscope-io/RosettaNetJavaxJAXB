# RosettaNet JAXB Utilities

This project contains JAXB-generated models, bindings, and round-trip validation tests for the DScope RosettaNet payload library. It uses Gradle to orchestrate builds, generate test fixtures, and execute XML round-trip verification across the RosettaNet specification catalogue.

## Project Layout

- `src/main/java` – JAXB-generated domain libraries.
- `src/main/resources` – global RosettaNet configuration (`RosettaNet.properties`).
- `src/main/xsd` – RosettaNet schemas, specification descriptors, and binding customisations.
- `src/test/java` – Dynamic JUnit 5 test suites for marshaling/unmarshaling descriptive payloads.
- `src/main/dtd/rnif.md` – RNIF 2.0 envelope summary distilled from the RNIF DTD/message guideline set.
- `src/xsd/pip-documentation.md` – Local index of RosettaNet Partner Interface Process documentation links.

## Prerequisites

- Java 8 or later on the `PATH` (or `JAVA_HOME` set appropriately).
- Gradle 8+ available locally **or** use the provided `gradlew` wrapper once the wrapper JAR and properties are in place.

## Building

```bash
# Using local Gradle installation
gradle clean build

# Or, after adding the wrapper JAR/properties
./gradlew clean build
```

## Running Tests Only

```bash
# Execute the RosettaNet PIP round-trip validation
./gradlew test --tests '*RosettaNetPIPTest*'
```

The parameterised test exercises RosettaNet payloads defined in `src/test/resources`, performing dictionary-driven JAXB marshal/unmarshal round-trips to ensure the generated bindings remain consistent.

## Troubleshooting

- **Missing wrapper JAR** – Ensure `gradle/wrapper/gradle-wrapper.jar` and `gradle-wrapper.properties` exist if you intend to use `./gradlew`.
- **JAXB context errors** – Check that the relevant `.properties` files include the correct `packages` entries, and confirm the generated classes are on the classpath.
- **Spec XML not found** – Verify `src/main/xsd/specs.xml` (or `src/xsd/specs.xml`) lists the desired PIPs and that their `Descriptive` folders contain sample XML files.

## License

See [LICENSE](LICENSE) for details.
