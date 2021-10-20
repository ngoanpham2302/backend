package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Main.menu();
        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                Triangle.checkTypes();
                break;
            case 2:
                StudentPoint.rankAcademic();
                break;
            case 3:
                double a = 2;
                double b = 5;
                double c = 3;
                double delta = Equation.calDelta(a, b, c);
                Equation.findSolutions(delta, a, b, c);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này!");
        }

        scn.close();
    }

    public static void menu() {
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - Bài 1. Kiểm tra tam giác");
        System.out.println("2 - Bài 2. Xét học lực");
        System.out.println("3 - Bài 3. Giải phương trình bậc 2");
        System.out.println("0 - Thoát chương trình");
    }
}
