package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Bài 1: Mảng số nguyên: nhập, in dữ liệu, tìm phần tử nhỏ nhất, lớn nhất trong mảng
        System.out.println("Bài 1");

        NumberArray.enterInput();
        NumberArray.printNumbers();

        int minNumber = NumberArray.findMinNumber();
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minNumber);

        int maxNumber = NumberArray.findMaxNumber();
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxNumber);

        // Bài 2: Mảng các phương tiện giao thông: nhập, in dữ liệu
        System.out.println("Bài 2:");

        Transport.enterInput();
        Transport.printData();
    }
}
