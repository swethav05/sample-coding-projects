package com.fractions.codingproject.model;

public enum ComparisionType {
    GREATER_THAN(" Greater Than "), LESS_THAN(" Less Than "), EQUAL_TO(" Equal To ");

    String comparisionType;

    ComparisionType(String comparisionType) {
        this.comparisionType = comparisionType;
    }

    public String getComparisionType() {
        return comparisionType;
    }
}
