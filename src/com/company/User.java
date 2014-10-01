package com.company;

/**
 * Created by dimao on 10/1/14.
 */
public class User {

    protected String name;
    protected String password;
    protected BankAccount account = new BankAccount(name, password);

}

class BankAccount{
    BankAccount(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected String name;
    protected String password;


}
