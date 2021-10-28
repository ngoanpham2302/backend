package com.company;

// Câu 2: Viết chương trình thực hiện:
// Nhập chuỗi là tên của bạn, tiến hành chuẩn hóa chuỗi đó
// Nhập vào chuỗi bất kỳ, kiểm tra xem chuỗi đó có là chuỗi palindrome không

public class ExerciseTwo {
    // Chuẩn hóa chuỗi tên
    static String standardizeString(String str) {
        str = str.trim().toLowerCase();
        // Replace nhiều khoảng trắng liên tục bằng 1 khoảng trắng:
        str = str.replaceAll("\\s+", " ");
        String[] strArray = str.split(" ");
        String normalStr = "";

        for (int i = 0; i < strArray.length; i++) {
            String firstLetter = String.valueOf(strArray[i].charAt(0)).toUpperCase();
            normalStr += firstLetter + strArray[i].substring(1);
            if (i < strArray.length - 1) normalStr += " ";
        }
        return normalStr;
    }

    // Kiểm tra chuỗi Palindrome
    static boolean isPalindromeString(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr.equals(str);
    }
}
