package com.company;

// Câu 1: Cho chuỗi "Hello every one". Ký tự e xuất hiện bao nhiêu lần và có index là bao nhiêu?

public class FirstExercise {
    static void countCharacter() {
        String str = "Hello every one";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
                System.out.println("Ký tự 'e' có index là: " + i);
            }
        }
        System.out.println("Ký tự 'e' xuất hiện " + count + " lần trong chuỗi");
    }
}
