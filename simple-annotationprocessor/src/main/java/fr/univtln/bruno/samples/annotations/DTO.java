package fr.univtln.bruno.samples.annotations;

import java.lang.annotation.*;

/**
 * An annotation to add a fields to a given DTO
 * a DTO per (class,value) is generated.
 */
@Documented
@Target(ElementType.FIELD)
@Repeatable(DTOs.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface DTO {
    String value();
}