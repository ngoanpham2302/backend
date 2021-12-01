package com.company;

public enum Category {
    MOVIE ("Movie"),
    TV_SHOW ("TV Show");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
