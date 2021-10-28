package com.company;

// Câu 4: Cho chuỗi sau : You only live once, but if you do it right, once is enough. Thực hiện:
// Đếm số từ trong chuỗi
// Đếm và in ra index của các ký tự o;

public class ExerciseFour {
    // Đếm số từ trong chuỗi
    static int countWords(String s) {
        int count = 0;
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
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
