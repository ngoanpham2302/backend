package com.company;

public class Main {

    public static void main(String[] args) {
        // Waiter:
        Waiter wt = new Waiter(11, "Phan An", 23, 6000000, 750000);
        System.out.println(wt);

        // Kitchen:
        Kitchen kt = new Kitchen(21, "Hải Yến", 25, 8500000, 680000);
        System.out.println(kt);
    }
}
