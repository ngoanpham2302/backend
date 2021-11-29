package com.company;

// Lịch sử giao dịch bao gồm các thông tin như:
// mã giao dịch, ngày giao dịch, mô tả giao dịch, số tài khoản thụ hưởng, số tiền

import java.time.LocalDate;

public class TransactionHistory {
    private static int idCounter = 1000;
    private int id;
    private LocalDate tradingDate;
    private String description;
    private String beneficiaryAccount;
    private long tradingAmount;

    public TransactionHistory(String description, String beneficiaryAccount, long tradingAmount) {
        this.id = idCounter++; // Tăng dần id
        this.tradingDate = LocalDate.now(); // Lấy ngày hiện tại
        this.description = description;
        this.beneficiaryAccount = beneficiaryAccount;
        this.tradingAmount = tradingAmount;
    }

    public int getId() {
        return id;
    }

    public LocalDate getTradingDate() {
        return tradingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public long getTradingAmount() {
        return tradingAmount;
    }

    public void setTradingAmount(long tradingAmount) {
        this.tradingAmount = tradingAmount;
    }

    @Override
    public String toString() {
        return "Mã giao dịch " + id + " - Ngày: " + Controller.formatDate(tradingDate) + " - " + description
                + " - STK thụ hưởng: " + beneficiaryAccount + " - " + Controller.formatCurrency(tradingAmount);
    }
}
