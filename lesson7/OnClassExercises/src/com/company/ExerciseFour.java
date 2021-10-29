package com.company;

// Câu 4: Cho chuỗi sau : You only live once, but if you do it right, once is enough. Thực hiện:
// Đếm số từ trong chuỗi
// Đếm và in ra index của các ký tự o;

public class ExerciseFour {
    // Đếm số từ trong chuỗi
    static int countWords(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }

    // Đếm và in ra index của các ký tự o;
    static int countChar(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
                System.out.println("Index của ký tự 'o' là: " + i);
            }
        }
        return count;
    }
}
