package com.vulinh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denote that this field must be matched with a table alias (most used in join queries, but in some Hibernate ones as well).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface UseTableAlias {

    /**
     * Value for table alias.
     *
     * @return Value for table alias.
     */
    String value();
}