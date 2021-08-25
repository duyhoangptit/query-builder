package com.vulinh.data;

import java.lang.reflect.Field;

public class InvalidAnnotationCombinationException extends BuilderException {

    private static final long serialVersionUID = -8463838637366319754L;

    public InvalidAnnotationCombinationException(Field field, Object annotation1, Object annotation2) {
        super(String.format("Field [%s] contained invalid annotation combination: [%s] and [%s]", field.getName(), annotation1, annotation2));
    }
}