package com.company;

import java.util.List;

/**
 * Created by dimao on 10/1/14.
 */
public class Bank {
    protected List<BankAccount> accounts;

    public void addAccount(BankAccount acc){
        accounts.add(acc);
    }

}
