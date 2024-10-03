package fr.univtln.bruno.samples;

import lombok.extern.java.Log;

/**
 * The Test class demonstrates the usage of the Person class and its corresponding DTOs.
 */
@Log
public class Test {
    public static void main(String[] args) {
        // Create a new Person instance using the static factory method
        Person p1 = Person.of("a.b@ici.fr", "Alain", "Bernard", "A. Bernard");

        // Convert the Person instance to a PersonDTOsimple instance
        PersonDTOsimple p1DTOSimple = PersonDTOsimple.from(p1);
        // Log the PersonDTOsimple instance
        log.info(p1DTOSimple::toString);

        // Convert the Person instance to a PersonDTOdisplay instance
        PersonDTOdisplay p1DTODisplay = PersonDTOdisplay.from(p1);
        // Log the PersonDTOdisplay instance
        log.info(p1DTODisplay::toString);
    }
}