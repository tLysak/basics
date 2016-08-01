package com.brainacad.agudyma.javaSE.testAnnotation;

import java.lang.annotation.*;

/**
 * Created by User on 8/1/2016.
 */
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Log {
    String filename() default "app.log";
    }
