package fr.univtln.bruno.samples;

import fr.univtln.bruno.samples.annotations.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The Dog class represents a dog with an ID and a name.
 * It uses the @DTO annotation to specify which fields should be included in different DTOs.
 */
@Getter
@AllArgsConstructor(staticName = "of")
public class Dog {
    private int id;

    @DTO("simple")
    private String name;
}