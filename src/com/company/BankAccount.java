package com.company;

import java.awt.*;

/**
 * Created by dimao on 10/1/14.
 */
class BankAccount extends List{

    protected String name;
    protected String password;

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


}
