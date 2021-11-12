package com.company;

public class Menu {
    public static void mainMenu() {
        System.out.println("\n----- FPTSHOP PRODUCTS PORTFOLIO -----");
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - In thông tin dựa trên danh mục");
        System.out.println("2 - In thông tin các sản phẩm dựa theo thương hiệu");
        System.out.println("3 - In thông tin sản phẩm dựa trên mức giá");
        System.out.println("4 - Tìm kiếm sản phẩm theo tên");
        System.out.println("0 - Thoát chương trình");
    }

    public static void chooseCategoryMenu() {
        System.out.println("\nXin mời lựa chọn danh mục sản phẩm: ");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Apple");
        System.out.println("4 - Phụ kiện");
    }

    public static void choosePriceMenu() {
        System.out.println("\nXin mời lựa chọn mức giá: ");
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2 - dưới 4 triệu");
        System.out.println("3 - Từ 4 - dưới 7 triệu");
        System.out.println("4 - Từ 7 - dưới 13 triệu");
        System.out.println("5 - Từ 13 triệu trở lên");
    }
}
