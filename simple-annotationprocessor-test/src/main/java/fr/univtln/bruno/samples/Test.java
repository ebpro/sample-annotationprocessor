package fr.univtln.bruno.samples;

import lombok.extern.java.Log;

@Log
public class Test {
    public static void main(String[] args) {
        Person p1 = Person.of("a.b@ici.fr","Alain","Bernard", "A. Bernard");
        PersonDTOsimple p1DTOSimple = PersonDTOsimple.from(p1);
        log.info(p1DTOSimple::toString);
        PersonDTOdisplay p1DTODisplay = PersonDTOdisplay.from(p1);
        log.info(p1DTODisplay::toString);
    }
}
