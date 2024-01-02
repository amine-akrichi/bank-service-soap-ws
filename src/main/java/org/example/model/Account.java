package org.example.model;

import java.util.Date;

public class Account {
    private Long code;
    private Double balance;
    private Date creationDate;

    public Account(Long code, Double balance) {
        this.code = code;
        this.balance = balance;
        this.creationDate = new Date();
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "code=" + code +
                ", balance=" + balance +
                ", creationDate=" + creationDate +
                '}';
    }
}
