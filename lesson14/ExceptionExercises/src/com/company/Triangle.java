package com.company;

import java.util.Scanner;

// Câu 1. Viết chương trình kiểm tra 3 cạnh có là tam giác không.
// Có xử lý ngoại lệ khi người dùng nhập không phải số hoặc nhập cạnh tam giác nhỏ hơn 0

public class Triangle {
    static void isTriangle(double a, double b, double c) throws ArithmeticException {
        if (a <= 0) throw new ArithmeticException("Cạnh a nhập vào không hợp lệ!");
        if (b <= 0) throw new ArithmeticException("Cạnh b nhập vào không hợp lệ!");
        if (c <= 0) throw new ArithmeticException("Cạnh c nhập vào không hợp lệ!");

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(a + ", " + b + ", " + c + " là 3 cạnh của một tam giác.");
        } else {
            System.out.println(a + ", " + b + ", " + c + " không phải 3 cạnh của một tam giác.");
        }
    }

    static void enterInput() {
        boolean isContinued = true;

        while (isContinued) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n--- NHẬP ĐỘ DÀI 3 CẠNH ---");
                System.out.println("Nhập cạnh a: ");
                double a = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập cạnh b: ");
                double b = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập cạnh c: ");
                double c = Double.parseDouble(sc.nextLine());

                Triangle.isTriangle(a, b, c);
                isContinued = false;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại.");
            } catch (NumberFormatException e) {
                System.out.println("Cạnh nhập vào phải là số!");
                System.out.println("Vui lòng nhập lại.");
            }
        }
    }
}
