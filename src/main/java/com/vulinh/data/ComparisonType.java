package com.vulinh.data;

/**
 * Some common comparison types.
 */
public enum ComparisonType {
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL_TO(">="),
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL_TO("<="),
    NOT_EQUAL("!="),
    EQUAL_TO("="),
    IS_NULL("is null"),
    IS_NOT_NULL("is not null"),
    BETWEEN("between"),
    LIKE("like"),
    NOT_LIKE("not like");

    private final String sign;

    ComparisonType(String sign) {
        this.sign = sign;
    }

    /**
     * Return the 'sign' used for the comparison in question.
     *
     * @return Sign used for the comparison in question.
     */
    public String sign() {
        return sign;
    }
}
