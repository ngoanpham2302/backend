package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            menu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Câu 1. Kiểm tra 3 cạnh có là tam giác không.
                    Triangle.enterInput();
                    break;
                case 2:
                    // Câu 2: Kiểm tra thông tin cá nhân
                    PersonalInfo.getInfo();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    static void menu() {
        System.out.println("\n--- VUI LÒNG LỰA CHỌN MENU ---");
        System.out.println("1 - Kiểm tra 3 cạnh của tam giác");
        System.out.println("2 - Kiểm tra thông tin cá nhân");
        System.out.println("0 - Thoát chương trình");
    }
}
