package com.company;

public class Menu {
    public void mainMenu() {
        System.out.println("--- ĐĂNG NHẬP | ĐĂNG KÍ ---");
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("0 - Thoát chương trình");
    }

    public void failedloginMenu() {
        System.out.println("Đăng nhập thất bại. Vui lòng lựa chọn: ");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("0 - Thoát chương trình");
    }

    public void SuccessfulLoginMenu() {
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
    }
}