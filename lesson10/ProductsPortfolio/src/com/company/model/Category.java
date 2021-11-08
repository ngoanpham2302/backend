package com.company.model;

public enum Category {
    HOUSEWARE("Đồ gia dụng"),
    FASHION("Thời trang"),
    COSMETIC("Mỹ phẩm"),
    FOOD("Thực phẩm");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
