package com.company;

import java.util.Random;

// 1, Viết chương trình sinh 1 số ngẫu nhiên, kiểm tra số đó là chẵn hay lẻ, sử dụng toán tử ba ngôi

public class RandomNumber {
    static void checkParity() {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        String result = randomNum % 2 == 0 ? randomNum + " là số chẵn" : randomNum + " là số lẻ";
        System.out.println("Số ngẫu nhiên: " + randomNum);
        System.out.println(result);
    }
}
