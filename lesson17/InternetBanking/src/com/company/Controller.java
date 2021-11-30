package com.company;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceAmount = 5000000; // Số dư tài khoản
    List<TransactionHistory> transHistoryList = new ArrayList<>(); // List lịch sử giao dịch

    // Truy vấn số dư tài khoản
    public long getAccountBalance() {
        return balanceAmount;
    }

    // Kiểm tra số tài khoản ngân hàng có hợp lệ không
    public static boolean checkBankAccount(String account) {
        final String ACCOUNT_REGEX = "\\d{8,16}";
        if (!account.matches(ACCOUNT_REGEX)) {
            System.out.println("Số tài khoản thụ hưởng không hợp lệ! Vui lòng nhập lại.");
            return false;
        }
        return true;
    }


    // Kiểm tra số tiền cần chuyển có hợp lệ không
    public static boolean checkTransferMoney(long transMoney) {
        if (transMoney > balanceAmount - 50000) {
            System.out.println("Số tiền chuyển vượt quá số dư tài khoản (" + formatCurrency(balanceAmount)
                    + "). Vui lòng nhập lại.");
            return false;
        } else if (transMoney < 50000) {
            System.out.println("Số tiền chuyển tối thiểu là 50,000 VND. Vui lòng nhập lại.");
            return false;
        } else {
            return true;
        }
    }

    // Thực hiện chuyển tiền
    public void executeMoneyTransfer() {
        Scanner sc = new Scanner(System.in);
        String beneficiaryAccount = "";
        System.out.println("Mời nhập thông tin giao dịch");

        boolean isValidAccount = false;
        while (!isValidAccount) {
            System.out.println("Số tài khoản thụ hưởng: ");
            beneficiaryAccount = sc.nextLine();

            if (checkBankAccount(beneficiaryAccount)) {
                isValidAccount = true;
            }
        }

        boolean isValidMoney = false;
        while (!isValidMoney) {
            System.out.println("Số tiền chuyển khoản: ");
            long transferAmount = sc.nextLong();
            sc.nextLine();

            if (checkTransferMoney(transferAmount)) {
                isValidMoney = true;
                balanceAmount -= transferAmount; // update số dư tài khoản

                System.out.println("Nội dung chuyển khoản: ");
                String description = sc.nextLine();

                System.out.println("CHUYỂN KHOẢN THÀNH CÔNG!");
                System.out.println("Số dư tài khoản hiện tại: " + formatCurrency(balanceAmount));

                // Lưu vào list lịch sử giao dịch:
                transHistoryList.add(new TransactionHistory(description, beneficiaryAccount, transferAmount));
            }
        }
    }

    // In danh sách lịch sử giao dịch
    public void showTransHistoryList() {
        if (transHistoryList.size() == 0) {
            System.out.println("Lịch sử giao dịch trống!");
        } else {
            transHistoryList.forEach(transaction -> System.out.println(transaction));
        }
    }

    // Format ngày
    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    // Format tiền
    public static String formatCurrency(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money) + " VND";
    }
}
