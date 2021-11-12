package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository repo = new ProductRepository();
        ArrayList<Product> productList = repo.getData();

        while (true) {
            Menu.mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Category category = repo.getCategory();
                    repo.getProductsByCategory(productList, category);
                    break;
                case 2:
                    System.out.println("\nNhập tên thương hiệu cần tìm: ");
                    String searchBrand = sc.nextLine();
                    repo.getProductsByBrand(productList, searchBrand);
                    break;
                case 3:
                    repo.getProductsByPrice(productList);
                    break;
                case 4:
                    System.out.println("\nNhập tên sản phẩm cần tìm: ");
                    String searchName = sc.nextLine();
                    repo.searchProductByName(productList, searchName);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
