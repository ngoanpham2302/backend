package com.company;

import com.company.model.Product;
import com.company.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository repo = new ProductRepository();
        ArrayList<Product> productList = repo.getData();

        while (true) {
            mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("In thông tin danh sách sản phẩm: ");
                    repo.printList(productList);
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm có giá lớn hơn 100000: ");
                    repo.printListPriceOver100(productList);
                    break;
                case 3:
                    System.out.println("Sắp xếp sản phẩm theo số lượng bán giảm dần: ");
                    repo.sortBySoldQuantity(repo.getData());
                    break;
                case 4:
                    System.out.println("Sản phẩm bán chạy nhất: ");
                    System.out.println(repo.getBestSeller(productList));
                    break;
                case 5:
                    System.out.println("In thông tin sản phẩm theo danh mục: ");
                    repo.printListByCategory(productList);
                    break;
                case 6:
                    System.out.println("Tìm kiếm sản phẩm theo tên: ");
                    System.out.println("Hãy nhập từ khóa cần tìm kiếm (VD: giày, áo, đèn,...): ");
                    String searchStr = sc.nextLine();
                    repo.searchProductsByName(productList, searchStr);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này! Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("\n------- PRODUCT PORTFOLIO MENU -------");
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - In thông tin tất cả sản phẩm ra màn hình");
        System.out.println("2 - In thông tin các sản phẩm có giá lớn hơn 100.000");
        System.out.println("3 - Sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("4 - Lấy ra sản phẩm bán chạy nhất");
        System.out.println("5 - In thông tin sản phẩm theo danh mục");
        System.out.println("6 - Tìm kiếm sản phẩm theo tên");
        System.out.println("0 - Thoát chương trình");
    }
}
