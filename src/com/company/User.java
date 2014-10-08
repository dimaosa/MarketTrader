package com.company;
import java.math.BigInteger;
import java.util.Random;
import java.security.SecureRandom;
/**
 * Created by dimao on 10/1/14.
 */
public class User {

    protected String name;
    protected String surname;
    protected String password;
    protected BankAccount account = new BankAccount(name, password);
    protected Cart cart = new Cart();

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }
    public void info(){
        System.out.format(
                "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Password: " + this.password + "\n");
    }

    protected void generatePass(){

        SecureRandom random = new SecureRandom();
        this.password =  new BigInteger(30, random).toString(32);

    }

}

