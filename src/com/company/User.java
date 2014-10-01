package com.company;

/**
 * Created by dimao on 10/1/14.
 */
public class User {

    protected String name;
    protected String password;
    protected BankAccount account = new BankAccount(name, password);
    protected Cart cart = new Cart();
}

