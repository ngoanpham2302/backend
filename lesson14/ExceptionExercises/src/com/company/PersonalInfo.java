package com.company;

// Câu 2: Viết chương trình nhập vào thông tin cá nhân gồm tên, năm sinh, địa chỉ.
// Có xử lý ngoại lệ khi nhập năm sinh không phải số hoặc năm sinh phải từ năm 1900 đến hiện tại.
// Dựa vào năm sinh để tính tuổi. Nếu tuổi từ 18 trở lên thông báo người đó đã đủ tuổi bầu cử

import java.time.LocalDate;
import java.util.Scanner;

public class PersonalInfo {
    static void checkInfo(String name, String address, int bornYear) throws ArithmeticException {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        if (bornYear < 1900 || bornYear > currentYear) throw new ArithmeticException("Năm sinh không hợp lệ!");

        int age = currentYear - bornYear;
        if (age >= 18) {
            System.out.println(name + " - " + address + " - " + age + " tuổi: Đã đủ tuổi bầu cử");
        } else {
            System.out.println(name + " - " + address + " - " + age + " tuổi: Chưa đủ tuổi bầu cử");
        }
    }

    static void getInfo() {
        boolean isContinued = true;
        while (isContinued) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n--- NHẬP THÔNG TIN CÁ NHÂN ---");
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String address = sc.nextLine();
                System.out.println("Nhập năm sinh: ");
                int year = Integer.parseInt(sc.nextLine());

                PersonalInfo.checkInfo(name, address, year);
                isContinued = false;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại.");
            } catch (NumberFormatException e) {
                System.out.println("Năm sinh phải là số nguyên!");
                System.out.println("Vui lòng nhập lại.");
            }
        }
    }
}
