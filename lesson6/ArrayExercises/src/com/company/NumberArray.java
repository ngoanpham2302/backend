package com.company;

// Bài 1: Mảng số nguyên: nhập, in dữ liệu, tìm phần tử nhỏ nhất, lớn nhất trong mảng

import java.util.Scanner;

public class NumberArray {

    // Nhập dữ liệu
    static void enterInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử có index %d: ", i);
            arr[i] = sc.nextInt();
        }
    }

    // In dữ liệu
    static void printNumbers(int[] arr) {
        System.out.println("In mảng số nguyên sau khi nhập: ");
        for (int number : arr) {
            System.out.print(number + " \t");
        }
        System.out.println();
    }

    // Tìm phần tử nhỏ nhất trong mảng
    static int findMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Tìm phần tử lớn nhất trong mảng
    static int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
