package com.company.repository;

import com.company.model.Category;
import com.company.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository {

    // Nhập dữ liệu
    public ArrayList<Product> getData() {
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Áo sơ mi nữ Liyn", 526799, Category.FASHION, 500, 70));
        productList.add(new Product(2, "Bánh AFC rong biển", 57800, Category.FOOD, 1156, 372));
        productList.add(new Product(3, "Bình giữ nhiệt Lock&Lock", 650720, Category.HOUSEWARE, 1230, 687));
        productList.add(new Product(4, "Chân váy xếp ly Yody", 895000, Category.FASHION, 922, 435));
        productList.add(new Product(5, "Sữa tươi Vinamilk", 35000, Category.FOOD, 2345, 988));
        productList.add(new Product(6, "Giày sneaker nam Adidas", 1159450, Category.FASHION, 350, 129));
        productList.add(new Product(7, "Đèn bàn Panasonic", 780500, Category.HOUSEWARE, 783, 298));
        productList.add(new Product(8, "Sữa rửa mặt Hazeline", 68000, Category.COSMETIC, 985, 106));

        return productList;
    }

    // 1 - In thông tin toàn bộ sản phẩm
    public void printList(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    // 2 - In thông tin sản phẩm có giá lớn hơn 100000
    public void printListPriceOver100(ArrayList<Product> list) {
        for (Product product : list) {
            if (product.getPrice() > 100000) {
                System.out.println(product);
            }
        }
    }

    // 3 - Sắp xếp sản phẩm theo số lượng bán được
    public void sortBySoldQuantity(ArrayList<Product> list) {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getSoldQuantity() - o1.getSoldQuantity();
            }
        });
        printList(list);
    }

    // 4 - Lấy ra sản phẩm bán chạy nhất
    public Product getBestSeller(ArrayList<Product> list) {
        Product bestSeller = Collections.max(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getSoldQuantity(), o2.getSoldQuantity());
            }
        });
        return bestSeller;
    }

    // 5 - In thông tin sản phẩm theo danh mục
    public void printListByCategory(ArrayList<Product> list) {
        for (Category category : Category.values()) {
            System.out.println("\n--- " + category + " - " + category.getValue() + ": ");

            for (Product product : list) {
                if (product.getCategory().equals(category)) {
                    System.out.println(product);
                }
            }
        }
    }

    // 6 - Tìm kiếm sản phẩm theo tên
    public void searchProductsByName(ArrayList<Product> list, String searchKeywords) {
        boolean haveProduct = false;
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(searchKeywords.toLowerCase())) {
                System.out.println(product);
                haveProduct = true;
            }
        }
        if (!haveProduct) System.out.println("Không tìm thấy sản phẩm phù hợp!");
    }
}
