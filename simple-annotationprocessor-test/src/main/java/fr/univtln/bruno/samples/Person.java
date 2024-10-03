package fr.univtln.bruno.samples;

import fr.univtln.bruno.samples.annotations.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The Person class represents an individual with various attributes.
 * It uses the @DTO annotation to specify which fields should be included in different DTOs.
 */
@Getter
@AllArgsConstructor(staticName = "of")
public class Person {
    @DTO("simple")
    @DTO("display")
    private String email;

    @DTO("simple")
    private String firstname;

    @DTO("simple")
    private String lastname;

    @DTO("display")
    private String displayName;
}