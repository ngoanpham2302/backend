package com.company;

public enum Position {
    GK("Thủ môn"),
    DF("Hậu vệ"),
    MF("Tiền vệ"),
    FW("Tiền đạo");

    private String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
