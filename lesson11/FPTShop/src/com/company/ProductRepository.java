package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository {
    Scanner sc = new Scanner(System.in);

    // Nhập dữ liệu
    public ArrayList<Product> getData() {
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Oppo Reno5 8GB-128GB", "Oppo Reno5 8GB-128GB", 6688000L, 10, 7, "OPPO", Category.PHONE));
        productList.add(new Product(2, "Oppo Reno4 Pro", "Oppo Reno4 Pro", 11490000L, 25, 10, "OPPO", Category.PHONE));
        productList.add(new Product(3, "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip", 20990000L, 19, 3, "Samsung", Category.PHONE));
        productList.add(new Product(4, "Oppo A92", "Oppo A92", 5990000L, 30, 15, "OPPO", Category.PHONE));
        productList.add(new Product(5, "Xiaomi Redmi 9 4GB-64GB", "Xiaomi Redmi 9 4GB-64GB", 3190000L, 30, 25, "Xiaomi", Category.PHONE));
        productList.add(new Product(6, "Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T", 20790000L, 10, 6, "Asus", Category.LAPTOP));
        productList.add(new Product(7, "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 21840000L, 15, 4, "DELL", Category.LAPTOP));
        productList.add(new Product(8, "Dell Inspiron N7501 i7 10750H", "Dell Inspiron N7501 i7 10750H", 28970000L, 10, 1, "DELL", Category.LAPTOP));
        productList.add(new Product(9, "iPhone 12 Pro Max 128GB", "iPhone 12 Pro Max 128GB", 30990000L, 5, 2, "Apple", Category.APPLE));
        productList.add(new Product(10, "MacBook Air 13\" 2020 M1 16GB/256GB", "MacBook Air 13\" 2020 M1 16GB/256GB", 33990000L, 20, 4, "MacBook", Category.APPLE));
        productList.add(new Product(11, "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000L, 20, 15, "Xiaomi", Category.ACCESSORY));
        productList.add(new Product(12, "Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000L, 30, 19, "i.value", Category.ACCESSORY));
        productList.add(new Product(13, "Pin sạc dự phòng 10000mAh Mi Ultra Compact", " Pin sạc dự phòng 10000mAh Mi Ultra Compact", 710000L, 20, 10, "Xiaomi", Category.ACCESSORY));
        productList.add(new Product(14, " Vivo Y20 4GB-64GB", " Vivo Y20 4GB-64GB", 3690000L, 15, 1, "Vivo", Category.PHONE));

        return productList;
    }

    // Lấy danh mục sản phẩm
    public Category getCategory() {
        Category cate;
        Menu.chooseCategoryMenu();
        int categoryChoice = sc.nextInt();
        sc.nextLine();

        switch (categoryChoice) {
            case 1:
                cate = Category.PHONE;
                break;
            case 2:
                cate = Category.LAPTOP;
                break;
            case 3:
                cate = Category.APPLE;
                break;
            case 4:
                cate = Category.ACCESSORY;
                break;
            default:
                throw new IllegalStateException("Không có lựa chọn " + categoryChoice);
        }
        return cate;
    }

    // 1 - In thông tin dựa trên danh mục
    public void getProductsByCategory(ArrayList<Product> list, Category cate) {
        System.out.println("--- Sản phẩm trong danh mục: " + cate.getValue() + " ---");
        boolean haveProduct = false;
        for (Product pro : list) {
            if (pro.getCategory().equals(cate)) {
                System.out.println(pro);
                haveProduct = true;
            }
        }
        if (!haveProduct) System.out.println("Danh mục này hiện chưa có sản phẩm nào!");
    }

    // 2 - In thông tin các sản phẩm dựa theo hãng
    public void getProductsByBrand(ArrayList<Product> list, String brandName) {
        boolean haveProduct = false;
        for (Product pro : list) {
            if (pro.getBrand().equalsIgnoreCase(brandName)) {
                System.out.println(pro);
                haveProduct = true;
            }
        }
        if (!haveProduct) System.out.println("Thương hiệu này hiện chưa có sản phẩm nào!");
    }

    // 3 - In thông tin sản phẩm dựa trên mức giá
    public void getProductsByPrice(ArrayList<Product> list) {
        Menu.choosePriceMenu();
        boolean haveProduct = false;
        int priceChoice = sc.nextInt();
        sc.nextLine();

        switch (priceChoice) {
            case 1:
                for (Product pro : list) {
                    if (pro.getPrice() < 2000000) {
                        System.out.println(pro);
                        haveProduct = true;
                    }
                }
                break;
            case 2:
                for (Product pro : list) {
                    if (pro.getPrice() >= 2000000 && pro.getPrice() < 4000000) {
                        System.out.println(pro);
                        haveProduct = true;
                    }
                }
                break;
            case 3:
                for (Product pro : list) {
                    if (pro.getPrice() >= 4000000 && pro.getPrice() < 7000000) {
                        System.out.println(pro);
                        haveProduct = true;
                    }
                }
                break;
            case 4:
                for (Product pro : list) {
                    if (pro.getPrice() >= 7000000 && pro.getPrice() < 13000000) {
                        System.out.println(pro);
                        haveProduct = true;
                    }
                }
                break;
            case 5:
                for (Product pro : list) {
                    if (pro.getPrice() >= 13000000) {
                        System.out.println(pro);
                        haveProduct = true;
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này!");
                haveProduct = true;
                break;
        }

        if (!haveProduct) System.out.println("Không tìm thấy sản phẩm nào trong mức giá này!");
    }

    // 4 - Tìm kiếm sản phẩm theo tên
    public void searchProductByName(ArrayList<Product> list, String searchName) {
        boolean haveProduct = false;
        for (Product pro : list) {
            if (pro.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(pro);
                haveProduct = true;
            }
        }
        if (!haveProduct) System.out.println("Không tìm thấy sản phẩm phù hợp!");
    }
}
