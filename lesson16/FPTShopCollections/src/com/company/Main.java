package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository repo = new ProductRepository();
        ArrayList<Product> productList = repo.getData();
        ProductController controller = new ProductController();

        while (true) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Liệt kê số lượng sản phẩm theo danh mục: ");
                    Map<Category, Integer> categoryMap = controller.countProductsByCategory(productList);
                    controller.printMap(categoryMap);
                    break;

                case 2:
                    System.out.println("Liệt kê số lượng sản phẩm theo hãng: ");
                    Map<String, Integer> brandMap = controller.countProductsByBrand(productList);
                    controller.printMap(brandMap);
                    break;

                case 3:
                    System.out.println("Mời nhập tên sản phẩm cần tìm: ");
                    String searchName = sc.nextLine();
                    controller.searchProductByName(searchName, productList);
                    break;

                case 0:
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n--- XIN MỜI LỰA CHỌN: ---");
        System.out.println("1 - Liệt kê số lượng sản phẩm theo danh mục");
        System.out.println("2 - Liệt kê số lượng sản phẩm theo hãng");
        System.out.println("3 - Tìm sản phẩm theo tên");
        System.out.println("0 - Thoát chương trình");
    }
}
