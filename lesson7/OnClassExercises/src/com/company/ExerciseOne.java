package com.company;

// Câu 1: Viết chương trình thực hiện in ra màn hình

public class ExerciseOne {
    // Hình vuông
    static void drawSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    // Hình tam giác vuông
    static void drawRightTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    // Hình tam giác đều
    static void drawEquilTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
