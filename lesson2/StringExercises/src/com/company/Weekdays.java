package com.company;

// Bài 2: Hãy tạo enum cho ngày trong tuần (thứ 2, thứ 3,...)

public enum Weekdays {
    MONDAY ("Thứ hai"),
    TUESDAY ("Thứ ba"),
    WEDNESDAY ("Thứ tư"),
    THURSDAY ("Thứ năm"),
    FRIDAY ("Thứ sáu"),
    SATURDAY ("Thứ bảy"),
    SUNDAY ("Chủ nhật");

    public String value;

    Weekdays (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
