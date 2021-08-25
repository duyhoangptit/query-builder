package com.vulinh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denote that this field should use provided column name (for example, creating SQL instead of HQL).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface UseColumnName {

    /**
     * The column name to use in place of field name.
     *
     * @return The column name to use in place of field name.
     */
    String value();
}
