package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<? extends Employee> employeeList;
        Repository repo = new Repository();

        while (true) {
            menu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Danh sách waiter: ");
                    employeeList = repo.getAllWaiter();
                    repo.printList(employeeList);
                    break;

                case 2:
                    System.out.println("Danh sách kitchen: ");
                    employeeList = repo.getAllKitchen();
                    repo.printList(employeeList);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Không có lựa chọn này! Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n--- XIN MỜI LỰA CHỌN ---");
        System.out.println("1 - Danh sách waiter");
        System.out.println("2 - Danh sách kitchen");
        System.out.println("0 - Thoát chương trình");
    }
}
