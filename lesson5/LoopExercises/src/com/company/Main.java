package com.company;

public class Main {

    public static void main(String[] args) {
        // Câu 1: Cho chuỗi "Hello every one". Ký tự e xuất hiện bao nhiêu lần và có index là bao nhiêu?
        System.out.println("Câu 1: ");
        FirstExercise.countCharacter();

        // Câu 2: Trả về vị trí mà strB được tìm thấy trong strA, -1: không tìm thấy, >= 0: là  vị trí tìm thấy
        System.out.println("Câu 2: ");
        int result = SecondExercise.find("Hello every one", "ever");
        System.out.println(result);

        // Câu 3: Tìm từ dài nhất trong chuỗi: "Không có gì quý hơn độc lập tự do"
        System.out.println("Câu 3: ");
        String inputStr = "Không có gì quý hơn độc lập tự do ";
        String resultWord = ThirdExercise.findLongestWord(inputStr);
        System.out.println(resultWord);
    }
}
