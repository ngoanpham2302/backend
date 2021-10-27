package com.company;

// Bài 1: Mảng số nguyên: nhập, in dữ liệu, tìm phần tử nhỏ nhất, lớn nhất trong mảng

import java.util.Scanner;

public class NumberArray {
    private static int[] numberArr;

    // Nhập dữ liệu
    static void enterInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng số nguyên: ");
        int arrLength = sc.nextInt();
        numberArr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Nhập phần tử có index %d: ", i);
            int number = sc.nextInt();
            numberArr[i] = number;
        }
    }

    // In dữ liệu
    static void printNumbers() {
        System.out.println("Mảng số nguyên sau khi nhập: ");
        for (int number : numberArr) {
            System.out.print(number + " \t");
        }
        System.out.println();
    }

    // Tìm phần tử nhỏ nhất trong mảng
    static int findMinNumber() {
        int min = numberArr[0];
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] < min) {
                min = numberArr[i];
            }
        }
        return min;
    }

    // Tìm phần tử lớn nhất trong mảng
    static int findMaxNumber() {
        int max = numberArr[0];
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] > max) {
                max = numberArr[i];
            }
        }
        return max;
    }
}
