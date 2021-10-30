package com.company;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double theoryScore;
    double practiceScore;
    String school;

    // Constructor
    public Student(int id, String name, double theoryScore, double practiceScore, String school) {
        this.id = id;
        this.name = name;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.school = school;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + "Điểm lý thuyết: " + theoryScore + " - "
                + "Điểm thực hành: " + practiceScore + " - " + "Điểm trung bình: "
                + calAverageScore(theoryScore, practiceScore) + " - " + "Trường " + school;
    }

    // Nhập thông tin học viên
    public static void enterInput(Student[] students) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Nhập thông tin học viên thứ %d: \n", i + 1);
            System.out.println("Nhập id: ");
            int stuId = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập tên: ");
            String stuName = sc.nextLine();
            System.out.println("Nhập điểm lý thuyết: ");
            double stuTheoScore = sc.nextDouble();
            System.out.println("Nhập điểm thực hành: ");
            double stuPracScore = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập trường: ");
            String stuSchool = sc.nextLine();

            Student student = new Student(stuId, stuName, stuTheoScore, stuPracScore, stuSchool);
            students[i] = student;
        }
    }

    // Tính điểm trung bình
    public double calAverageScore(double theoScore, double pracScore) {
        return (theoScore + pracScore) / 2;
    }

    // In thông tin học viên
    public static void printInfo(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
