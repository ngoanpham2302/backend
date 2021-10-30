package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin học viên:
        System.out.println("Nhập số lượng học viên: ");
        int quantity = sc.nextInt();
        Student[] students = new Student[quantity];
        Student.enterInput(students);

        // In thông tin học viên:
        System.out.println("Thông tin học viên: ");
        Student.printInfo(students);
    }
}
