package com.company;

// Câu 5: Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.

import java.util.Random;

public class ExerciseFive {
    // In ra số ngẫu nhiên
    static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }

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
}
