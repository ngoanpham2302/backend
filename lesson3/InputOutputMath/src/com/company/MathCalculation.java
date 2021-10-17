package com.company;

import java.util.Scanner;

// 3. Nhập hai số nguyên x và y, viết phương thức thực hiện các phép tính toán với x, y

public class MathCalculation {
    static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số nguyên x: ");
        int x = sc.nextInt();
        System.out.println("Vui lòng nhập số nguyên y: ");
        int y = sc.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x : y = " + ((double) x / y));
        sc.close();
    }
}
