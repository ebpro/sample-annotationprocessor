package fr.univtln.bruno.samples;

import fr.univtln.bruno.samples.annotations.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "of")
public class Dog {
    private int id;
    @DTO("simple")
    private String name;
}
