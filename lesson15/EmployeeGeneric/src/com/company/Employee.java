package com.company;

import java.text.DecimalFormat;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private long basicSalary;

    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract long calculatorSalary();

    public String formatCurrency(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money) + " VND";
    }

    @Override
    public String toString() {
        return "Mã nhân viên " + id + " - " + name + " - " + age + " tuổi - Lương cơ bản: "
                + formatCurrency(basicSalary) + " - Tổng lương: " + formatCurrency(calculatorSalary());
    }
}
