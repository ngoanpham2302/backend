package com.company.model;

import java.text.DecimalFormat;

public class Product {
    private int id;
    private String name;
    private long price;
    private Category category;
    private int inventory;
    private int soldQuantity;

    public Product(int id, String name, long price, Category category, int inventory, int soldQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.inventory = inventory;
        this.soldQuantity = soldQuantity;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    @Override
    public String toString() {
        return "Mã SP " + id + " - " + name + " - " + formatCurrency(price) + " - " + category.getValue()
                + " - Số lượng: " + inventory + " - Đã bán: " + soldQuantity;
    }

    public String formatCurrency(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money) + " VND";
    }
}
