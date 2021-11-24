package com.company;

import java.util.ArrayList;

public class Repository {
    public ArrayList<Waiter> getAllWaiter() {
        ArrayList<Waiter> waiterList = new ArrayList<>();

        waiterList.add(new Waiter(111, "Phạm An", 25, 6500000, 600000));
        waiterList.add(new Waiter(112, "Nguyễn Hoàng", 35, 7250000, 750000));
        waiterList.add(new Waiter(113, "Trịnh Liên", 22, 6180000, 570000));

        return waiterList;
    }

    public ArrayList<Kitchen> getAllKitchen() {
        ArrayList<Kitchen> kitchenList = new ArrayList<>();

        kitchenList.add(new Kitchen(211, "Trần Hoa", 32, 7200000, 800000));
        kitchenList.add(new Kitchen(212, "Đỗ Lan", 30, 6900000, 750000));
        kitchenList.add(new Kitchen(213, "Vũ Hải", 28, 6880000, 780000));

        return kitchenList;
    }

    public void printList(ArrayList<? extends Employee> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
