package com.company;

import java.text.DecimalFormat;

public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int inventory;
    private int soldQuantity;
    private String brand;
    private Category category;

    public Product(int id, String name, String description, long price, int inventory,
                   int soldQuantity, String brand, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.inventory = inventory;
        this.soldQuantity = soldQuantity;
        this.brand = brand;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mã SP " + id + " - " + name + " - " + description + " - " + formatCurrency(price) + " - Số lượng: "
                + inventory + " - Đã bán: " + soldQuantity + " - " + brand + " - " + category.getValue();
    }

    public String formatCurrency(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money) + " VND";
    }
}
