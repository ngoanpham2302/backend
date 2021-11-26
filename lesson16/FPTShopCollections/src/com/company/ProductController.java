package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductController {

    // Liệt kê số lượng sản phẩm theo danh mục
    public Map<Category, Integer> countProductsByCategory(ArrayList<Product> productList) {
        Map<Category, Integer> categoryMap = new HashMap<>();

        for (Product product : productList) {
            Category cateKey = product.getCategory();
            if (categoryMap.get(cateKey) == null) {
                categoryMap.put(cateKey, 1);
            } else {
                categoryMap.put(cateKey, categoryMap.get(cateKey) + 1);
            }
        }

        return categoryMap;
    }

    // Liệt kê số lượng sản phẩm theo hãng
    public Map<String, Integer> countProductsByBrand(ArrayList<Product> productList) {
        Map<String, Integer> brandMap = new HashMap<>();

        for (Product product : productList) {
            String brandKey = product.getBrand();
            if (brandMap.get(brandKey) == null) {
                brandMap.put(brandKey, 1);
            } else {
                brandMap.put(brandKey, brandMap.get(brandKey) + 1);
            }
        }

        return brandMap;
    }


    // Tìm sản phẩm theo tên
    public void searchProductByName(String searchName, ArrayList<Product> productList) {
        ArrayList<Product> searchList = new ArrayList<>();
        int count = 0;

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(searchName.toLowerCase())) {
                searchList.add(product);
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Tìm thấy " + count + " sản phẩm phù hợp: ");
            printList(searchList);
        } else {
            System.out.println("Không tìm thấy sản phẩm phù hợp!");
        }
    }


    // In map
    public <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " sản phẩm");
        }
    }

    // In list
    public static void printList(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
