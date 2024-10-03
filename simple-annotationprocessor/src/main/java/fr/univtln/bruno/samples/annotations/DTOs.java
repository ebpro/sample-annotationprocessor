package fr.univtln.bruno.samples.annotations;

import java.lang.annotation.*;

/**
 * The DTOs annotation is used to make the @DTO annotation repeatable.
 * It allows multiple @DTO annotations to be applied to a single field.
 *
 * @see DTO
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DTOs {
    DTO[] value();
}