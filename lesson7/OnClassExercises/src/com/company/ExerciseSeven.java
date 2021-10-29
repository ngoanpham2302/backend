package com.company;

// Câu 7: Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím. Thực hiện:
// Nhập các phần tử mảng
// In thông tin mảng ra màn hình
// Liệt kê các phần tử nằm trên đường chéo chính

import java.util.Scanner;

public class ExerciseSeven {
    // Nhập các phần tử mảng
    static void enterInput(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập phần tử có vị trí [%d-%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Liệt kê các phần tử nằm trên đường chéo chính
    static void printDiagonalEle(int row, int col, int arr[][]) {
        if (row != col) {
            System.out.println("Đây không phải ma trận vuông. Vui lòng nhập số hàng và số cột bằng nhau.");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        System.out.print(arr[i][j] + "\t");
                    }
                }
            }
        }
    }
}
