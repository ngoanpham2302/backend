package com.company;

// Câu 3: Giải phương trình bậc 2: ax2 + bx + c = 0 với a != 0

public class Equation {
    static double calDelta(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    static void findSolutions(double delta, double a, double b, double c) {
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Phương trình có nghiệm kép: x = %.2f", x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
    }
}
