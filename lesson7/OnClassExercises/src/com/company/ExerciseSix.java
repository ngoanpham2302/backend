package com.company;

// Câu 6: Viết chương trình nhập email của bạn, kiểm tra email đó có hợp lệ không (Sử dụng regex)

public class ExerciseSix {
    public static boolean validateEmail(String emailStr) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        boolean isValid = emailStr.matches(EMAIL_REGEX);
        return isValid;
    }
}
