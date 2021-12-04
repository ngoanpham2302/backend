package com.company;

public class Validation {
    static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    static final String PASSWORD_REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,15}$";

    public String validateEmail(String email) {
        if (email.matches(EMAIL_REGEX)) {
            return email;
        } else {
            throw new RuntimeException("Email không hợp lệ!");
        }
    }

    public String validatePassword(String password) {
        if (password.matches(PASSWORD_REGEX)) {
            return password;
        } else {
            throw new RuntimeException("Mật khẩu không hợp lệ! Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt.");
        }
    }

}
