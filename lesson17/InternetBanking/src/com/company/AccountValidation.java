package com.company;

public class AccountValidation {

    public static final String PHONE = "0123456789";
    public static final String PASSWORD = "Abcd@1234";

    // Validate số điện thoại và mật khẩu đăng nhập
    public boolean validate(String phone, String password) {
        if (phone.equals(PHONE)) {
            if (!password.equals(PASSWORD)) {
                System.out.println("Mật khẩu không đúng! Vui lòng kiểm tra lại.");
                return false;
            } else {
                System.out.println("Đăng nhập thành công!");
                return true;
            }
        } else {
            if (password.equals(PASSWORD)) {
                System.out.println("Số điện thoại không đúng! Vui lòng kiểm tra lại.");
            } else {
                System.out.println("Số điện thoại và mật khẩu không đúng! Vui lòng kiểm tra lại.");
            }
            return false;
        }
    }
}
