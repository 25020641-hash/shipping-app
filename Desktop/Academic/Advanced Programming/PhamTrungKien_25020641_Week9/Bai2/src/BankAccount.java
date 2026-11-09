package com.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp quản lý tài khoản ngân hàng.
 */
public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Nạp tiền vào tài khoản.
     *
     * @param amount Số tiền nạp
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            logger.error("Giao dịch thất bại: Số tiền nạp không hợp lệ (amount={})", amount);
            throw new IllegalArgumentException("Số tiền nạp phải lớn hơn 0");
        }
        this.balance += amount;
        logger.info("Giao dịch thành công: Nạp {} | Số dư mới: {}", amount, this.balance);
    }

    public double getBalance() {
        return balance;
    }
}