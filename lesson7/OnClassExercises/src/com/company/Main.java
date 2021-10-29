package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1:
        System.out.println("Bài 1: ");
        System.out.println("In hình vuông cạnh bằng 4");
        ExerciseOne.drawSquare(4);

        System.out.println("In hình tam giác vuông có chiều cao bằng 4");
        ExerciseOne.drawRightTriangle(4);

        System.out.println("In hình tam giác đều có cạnh bằng 4");
        ExerciseOne.drawEquilTriangle(4);

        // Bài 2:
        System.out.println("Bài 2: ");
        // Chuẩn hóa chuỗi
        System.out.println("Vui lòng nhập chuỗi tên cần chuẩn hóa: ");
        String nameStr = sc.nextLine();
        String nameResult = ExerciseTwo.standardizeString(nameStr);
        System.out.println("Chuỗi tên sau khi chuẩn hóa: ");
        System.out.println(nameResult);

        // Kiểm tra chuỗi Palindrome
        System.out.println("Vui lòng nhập chuỗi cần kiểm tra Palindrome: ");
        String inputStr = sc.nextLine();
        boolean isPalindrome = ExerciseTwo.isPalindromeString(inputStr);
        String palindResult = isPalindrome ? "\"" + inputStr + "\" là chuỗi Palindrome"
                : "\"" + inputStr + "\" không phải chuỗi Palindrome";
        System.out.println(palindResult);

        // Bài 3:
        System.out.println("Bài 3: ");
        System.out.println("In 10 số nguyên tố đầu tiên: ");
        ExerciseThree.printTenPrimes(10);
        System.out.println("\nIn các số nguyên tố nhỏ hơn 10: ");
        ExerciseThree.printPrimesLessThanTen(10);

        // Bài 4:
        System.out.println("\nBài 4: ");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("Tổng số từ có trong chuỗi là: " + ExerciseFour.countWords(str));
        int countResult = ExerciseFour.countChar(str, 'o');
        System.out.println("Số lần xuất hiện của ký tự 'o' trong chuỗi: " + countResult);

        // Bài 5:
        System.out.println("Bài 5: ");
        int randomNumber = ExerciseFive.getRandomNumber();
        System.out.println("Số ngẫu nhiên là: " + randomNumber);
        boolean isPrime = ExerciseFive.isPrimeNumber(randomNumber);
        String result = isPrime ? randomNumber + " là số nguyên tố" : randomNumber + " không phải số nguyên tố";
        System.out.println(result);

        // Bài 6:
        System.out.println("Bài 6: ");
        System.out.println("Vui lòng nhập email: ");
        String inputEmail = sc.nextLine();
        boolean isValidEmail = ExerciseSix.validateEmail(inputEmail);
        String emailResult = isValidEmail ? "Email hợp lệ" : "Email không hợp lệ";
        System.out.println(emailResult);

        // Bài 7:
        System.out.println("Bài 7: ");
        System.out.println("Nhập số hàng của mảng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int col = sc.nextInt();
        int[][] newArr = new int[row][col];

        System.out.println("Nhập các phần tử của mảng: ");
        ExerciseSeven.enterInput(newArr);
        System.out.println("Các phần tử trong mảng: ");
        ExerciseSeven.printArray(newArr);
        System.out.println("Các phần tử nằm trên đường chéo chính: ");
        ExerciseSeven.printDiagonalEle(row, col, newArr);
    }
}
