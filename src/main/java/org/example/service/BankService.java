package org.example.service;

import org.example.model.Account;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "BankWS")
public class BankService {
    private Account account;

    public BankService() {
        this.account = new Account(500L, 10.0);
    }

    @WebMethod(operationName = "withdraw")
    public boolean withdrawAmount(@WebParam(name = "amount") double amount) {
        if (amount <= this.account.getBalance()) {
            this.account.setBalance(this.account.getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    @WebMethod(operationName = "deposit")
    public void depositAmount(@WebParam(name = "amount") double amount) {
        this.account.setBalance(this.account.getBalance() + amount);
    }

    @WebMethod(operationName = "getBalance")
    public double getBalance() {
        return this.account.getBalance();
    }
}
