package com.company;

// Câu 2: Trả về vị trí mà strB được tìm thấy trong strA, -1: không tìm thấy, >= 0: là  vị trí tìm thấy

public class SecondExercise {
    static int find(String strA, String strB) {
        for (int i = 0; i <= strA.length() - strB.length(); i++) {
            for (int j = 0; j <= strB.length() - 1; j++) {
                if (strB.charAt(j) == strA.charAt(i + j)) {
                    if (j == strB.length() - 1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}
