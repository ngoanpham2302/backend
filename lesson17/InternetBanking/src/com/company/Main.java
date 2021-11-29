package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountValidation accountValidation = new AccountValidation();
        Controller controller = new Controller();

        // Validate số điện thoại, mật khẩu, đăng nhập
        boolean isValidInfo = false;
        while (!isValidInfo) {
            System.out.println("\nTHÔNG TIN ĐĂNG NHẬP");
            System.out.println("Nhập số điện thoại: ");
            String phone = sc.nextLine();

            System.out.println("Nhập mật khẩu: ");
            String password = sc.nextLine();

            isValidInfo = accountValidation.validate(phone, password);
        }

        // SĐT và mật khẩu đúng -> vào menu
        while (true) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    long currentBalance = controller.getAccountBalance();
                    System.out.println("Số dư tài khoản hiện tại: " + Controller.formatCurrency(currentBalance));
                    break;

                case 2:
                    System.out.println("Chuyển tiền 24/7");
                    controller.executeMoneyTransfer();
                    break;

                case 3:
                    System.out.println("Danh sách lịch sử giao dịch: ");
                    controller.showTransHistoryList();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Không có lựa chọn này!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n--- VPBANK INTERNET BANKING ---");
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - Kiểm tra số dư tài khoản");
        System.out.println("2 - Chuyển khoản");
        System.out.println("3 - Kiểm tra lịch sử giao dịch");
        System.out.println("0 - Thoát ứng dụng");
    }
}
