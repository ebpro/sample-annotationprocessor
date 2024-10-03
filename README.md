# Simple Annotation Processor

## Overview

This project demonstrates the use of custom annotations and annotation processing in Java. It includes a custom annotation `@DTO` and an annotation processor `DTOProcessor` that generates Data Transfer Object (DTO) classes based on the annotated fields.

## Project Structure

- **simple-annotationprocessor**: Contains the custom annotations and the annotation processor.
- **simple-annotationprocessor-test**: Contains test classes to demonstrate the usage of the annotations and the generated DTOs.

## Annotations

### `@DTO`

The `@DTO` annotation is used to specify fields that should be included in a generated DTO class. A separate DTO class is generated for each unique combination of class and value.

[Source](simple-annotationprocessor/src/main/java/fr/univtln/bruno/samples/annotations/DTO.java)

### `@DTOs`

The `@DTOs` annotation is used to make the `@DTO` annotation repeatable.

[Source](simple-annotationprocessor/src/main/java/fr/univtln/bruno/samples/annotations/DTOs.java)

## Annotation Processor

The `DTOProcessor` class processes the `@DTO` annotations and generates DTO classes.

[Source](simple-annotationprocessor/src/main/java/fr/univtln/bruno/samples/annotations/DTOProcessor.java)

## Usage

### Example

Here is an example of how to use the `@DTO` annotation and the generated DTO classes.

#### Person Class

[Source](simple-annotationprocessor-test/src/main/java/fr/univtln/bruno/samples/Person.java)

#### Test Class

[Source](simple-annotationprocessor-test/src/main/java/fr/univtln/bruno/samples/Test.java)

## Building the Project

To build the project, use the Maven Wrapper:

```sh
./mvnw clean install
```

## Running the Project

To run the project using the `exec:java` plugin, use the following command:

```sh
./mvnw install
 ./mvnw -pl simple-annotationprocessor-test/ exec:java \
        -Dexec.mainClass="fr.univtln.bruno.samples.Test"
```

## License

This project is licensed under the MIT License.
```