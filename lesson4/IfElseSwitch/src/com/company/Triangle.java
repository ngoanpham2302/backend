package com.company;

/* Câu 1: Viết chương trình nhập vào 3 cạnh của tam giác,
Kiểm tra 3 cạnh đó có hợp thành tam giác không?
Nếu có kiểm tra xem đó là tam giác gì? */

import java.util.Scanner;

public class Triangle {
    static boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    static boolean isRightTriangle(double a, double b, double c) {
        return (a * a + b * b == c * c || a * a + c * c == b * b
                || b * b + c * c == a * a);
    }

    static boolean isObtuseTriangle(double a, double b, double c) {
        return (a * a + b * b < c * c || a * a + c * c < b * b
                || b * b + c * c < a * a);
    }

    public static void checkTypes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("a, b, c tạo thành một tam giác đều");
            } else if (a == b || a == c || b == c) {
                if (isRightTriangle(a, b, c)) {
                    System.out.println("a, b, c tạo thành một tam giác vuông cân");
                } else {
                    System.out.println("a, b, c tạo thành một tam giác cân");
                }
            } else if (isRightTriangle(a, b, c)) {
                System.out.println("a, b, c tạo thành một tam giác vuông");
            } else if (isObtuseTriangle(a, b, c)) {
                System.out.println("a, b, c tạo thành một tam giác tù");
            } else {
                System.out.println("a, b, c tạo thành một tam giác nhọn");
            }
        } else {
            System.out.println("a, b, c không phải ba cạnh của một tam giác");
        }

        sc.close();
    }
}
