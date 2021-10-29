package com.company;

// Câu 3: Viết chương trình thực hiện:
// Liệt kê 10 số nguyên tố đầu tiên
// Liệt kê các số nguyên tố nhỏ hơn 10

public class ExerciseThree {
    // Kiểm tra số nguyên tố
    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Liệt kê 10 số nguyên tố đầu tiên
    static void printTenPrimes(int n) {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrimeNumber(number)) {
                System.out.print(number + "\t");
                count++;
            }
            number++;
        }
    }

    // Liệt kê các số nguyên tố nhỏ hơn 10
    static void printPrimesLessThanTen(int number) {
        for (int i = 0; i < number; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + "\t");
            }
        }
    }
}
