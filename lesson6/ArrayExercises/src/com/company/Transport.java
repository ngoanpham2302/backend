package com.company;

// Bài 2: Mảng các phương tiện giao thông: nhập, in dữ liệu

import java.util.Scanner;

public class Transport {
    private static Transport[] transportArr;
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
    static void enterInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng phương tiện giao thông: ");
        int len = sc.nextInt();
        transportArr = new Transport[len];

        for (int i = 0; i < len; i++) {
            System.out.printf("Nhập thông tin phương tiện thứ %d: \n", i + 1);
            System.out.println("Mã số phương tiện (nhập số nguyên): ");
            int code = sc.nextInt();
            sc.nextLine();

            System.out.println("Tên phương tiện: ");
            String name = sc.nextLine();

            System.out.println("Vận tốc tối đa (km/h): ");
            double maxSpeed = sc.nextDouble();

            Transport transport = new Transport(code, name, maxSpeed);
            transportArr[i] = transport;
        }
    }

    // In dữ liệu
    static void printData() {
        for (Transport transport : transportArr) {
            System.out.println(transport);
        }
    }
}
