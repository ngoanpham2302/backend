package com.company;

// Bài 2: Mảng các phương tiện giao thông: nhập, in dữ liệu

import java.util.Scanner;

public class Transport {
    int code;
    String name;
    double maxSpeed;

    Transport(int tranCode, String tranName, double tranMaxSpeed) {
        code = tranCode;
        name = tranName;
        maxSpeed = tranMaxSpeed;
    }

    @Override
    public String toString() {
        return "Mã số " + code + " - " + name + " - " + "Vận tốc tối đa " + maxSpeed + "km/h";
    }

    // Nhập dữ liệu
    static void enterInput(Transport[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập thông tin phương tiện thứ %d: \n", i + 1);
            System.out.println("Mã số phương tiện (nhập số nguyên): ");
            int code = sc.nextInt();
            sc.nextLine();

            System.out.println("Tên phương tiện: ");
            String name = sc.nextLine();

            System.out.println("Vận tốc tối đa (km/h): ");
            double maxSpeed = sc.nextDouble();
            if (maxSpeed <= 0) {
                System.out.println("Vận tốc phải lớn hơn 0. Vui lòng nhập lại: ");
                maxSpeed = sc.nextDouble();
            }

            Transport transport = new Transport(code, name, maxSpeed);
            arr[i] = transport;
        }
    }

    // In dữ liệu
    static void printData(Transport[] arr) {
        for (Transport transport : arr) {
            System.out.println(transport);
        }
    }
}
