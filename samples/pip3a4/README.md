# PIP3A4 Purchase Order Request Demo

This sample demonstrates how to marshal and unmarshal the RosettaNet PIP3A4 Purchase Order
Request using the generated JAXB bindings that live in this repository.

## Layout

```
samples/pip3a4/
  README.md
  src/main/java/io/dscope/samples/pip3a4/PurchaseOrderRequestDemo.java
  src/main/resources/samples/pip3a4/PurchaseOrderRequest.xml
```

The XML payload under `src/main/resources` is the official descriptive sample that ships with
RosettaNet PIP3A4 V11.15.00.

## Running the demo

The Gradle build has a helper task that compiles the sample source set and executes the demo:

```sh
./gradlew runPip3a4Sample
```

The task will:

1. Unmarshal the sample XML into the generated JAXB model.
2. Mutate the document header and bump the first line item quantity.
3. Marshal the modified payload back to XML and print it to the console.

If you prefer to tinker from an IDE, mark `samples/pip3a4/src/main/java` as a separate source root
and run `io.dscope.samples.pip3a4.PurchaseOrderRequestDemo` directly.
