package com.company;

/* Câu 1: Viết chương trình nhập vào 3 cạnh của tam giác,
Kiểm tra 3 cạnh đó có hợp thành tam giác không?
Nếu có kiểm tra xem đó là tam giác gì? */

import java.util.Scanner;

public class Triangle {
    public static void checkTypes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập cạnh c: ");
        double c = sc.nextDouble();

        boolean isRightTriangle = a * a + b * b == c * c || a * a + c * c == b * b
                || b * b + c * c == a * a;

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("a, b, c tạo thành một tam giác đều");
            } else if (a == b || a == c || b == c) {
                if (isRightTriangle) {
                    System.out.println("a, b, c tạo thành một tam giác vuông cân");
                } else {
                    System.out.println("a, b, c tạo thành một tam giác cân");
                }
            } else if (isRightTriangle) {
                System.out.println("a, b, c tạo thành một tam giác vuông");
            } else if (a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a) {
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
