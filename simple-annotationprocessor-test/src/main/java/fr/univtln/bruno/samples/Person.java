package fr.univtln.bruno.samples;

import fr.univtln.bruno.samples.annotations.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

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
