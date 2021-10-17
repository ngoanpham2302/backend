package com.company;

// 2. Tính cạnh huyền của tam giác vuông khi biết: a = 3, b = 4, c = ?

public class Hypotenuse {
    static void calLength() {
        double hypoLength = Math.sqrt(3 * 3 + 4 * 4);
        System.out.println("Độ dài cạnh huyền của tam giác vuông là: " + hypoLength);
    }
}
