package com.company;

// Câu 3: Tìm từ dài nhất trong chuỗi: "Không có gì quý hơn độc lập tự do"

public class ThirdExercise {
    static String findLongestWord(String input) {
        String[] inputArr = input.split(" ");
        String longestWord = "";

        for (String word : inputArr) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
