package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1: Mảng số nguyên: nhập, in dữ liệu, tìm phần tử nhỏ nhất, lớn nhất trong mảng
        System.out.println("Bài 1");
        System.out.println("Nhập số lượng phần tử trong mảng số nguyên: ");
        int arrLen = sc.nextInt();
        int[] numberArr = new int[arrLen];
        NumberArray.enterInput(numberArr);
        NumberArray.printNumbers(numberArr);

        int minNumber = NumberArray.findMinNumber(numberArr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minNumber);
        int maxNumber = NumberArray.findMaxNumber(numberArr);
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxNumber);

        // Bài 2: Mảng các phương tiện giao thông: nhập, in dữ liệu
        System.out.println("Bài 2:");
        System.out.println("Nhập số lượng phần tử trong mảng phương tiện giao thông: ");
        int len = sc.nextInt();
        Transport[] transportArr = new Transport[len];
        Transport.enterInput(transportArr);
        System.out.println("Mảng phương tiện giao thông sau khi nhập: ");
        Transport.printData(transportArr);
    }
}
