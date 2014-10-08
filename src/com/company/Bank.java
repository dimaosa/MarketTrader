package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimao on 10/1/14.
 */
public class Bank {
    protected ArrayList<BankAccount> accounts;


    public void addAccount(BankAccount acc){
        accounts.add(acc);
    }
    public void deleteAccount(BankAccount acc){
        accounts.remove(acc);
    }
    public void showAccounts(){
        accounts.stream()
                .forEach(System.out::println);
    }

}
