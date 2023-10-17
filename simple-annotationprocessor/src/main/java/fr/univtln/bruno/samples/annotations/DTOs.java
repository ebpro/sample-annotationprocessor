package fr.univtln.bruno.samples.annotations;

import java.lang.annotation.*;


/**
 * An annotation to make @DTO repeatable
 * @see DTO
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DTOs {
    DTO[] value();
}
