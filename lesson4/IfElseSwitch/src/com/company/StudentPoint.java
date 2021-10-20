package com.company;

/*Câu 2: Nhập điểm của 1 học sinh A gồm 4 môn: toán, văn, lý, hóa.
Tính trung bình cộng (TBC) 4 điểm đó.
Dựa vào điểm hãy xét học lực cho học sinh A*/

import java.util.Scanner;

public class StudentPoint {
    public static void rankAcademic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm môn học được tính theo thang điểm 10");
        System.out.println("Nhập điểm môn Toán: ");
        double maths = sc.nextDouble();
        System.out.println("Nhập điểm môn Văn: ");
        double literature = sc.nextDouble();
        System.out.println("Nhập điểm môn Lý: ");
        double physics = sc.nextDouble();
        System.out.println("Nhập điểm môn Hóa: ");
        double chemistry = sc.nextDouble();

        if (maths > 10 || literature > 10 || physics > 10 || chemistry > 10
                || maths < 0 || literature < 0 || physics < 0 || chemistry < 0) {
            System.out.println("Điểm nhập vào không hợp lệ");
            System.exit(0);
        } else {
            double averagePoint = (maths + literature + physics + chemistry) / 4;
            System.out.printf("Điểm trung bình: %.1f\n", averagePoint);

            if (averagePoint < 4.5) {
                System.out.println("Học lực yếu");
            } else if (averagePoint >= 4.5 && averagePoint < 6.5) {
                System.out.println("Học lực trung bình");
            } else if (averagePoint >= 6.5 && averagePoint < 8) {
                System.out.println("Học lực khá");
            } else {
                System.out.println("Học lực giỏi");
            }
        }
        sc.close();
    }
}
