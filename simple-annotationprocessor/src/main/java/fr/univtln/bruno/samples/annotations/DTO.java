package fr.univtln.bruno.samples.annotations;

import java.lang.annotation.*;

/**
 * The DTO annotation is used to specify fields that should be included in a generated DTO class.
 * A separate DTO class is generated for each unique combination of class and value.
 */
@Documented
@Target(ElementType.FIELD)
@Repeatable(DTOs.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface DTO {
    /**
     * The name of the DTO to which the annotated field should be added.
     *
     * @return the name of the DTO
     */
    String value();
}