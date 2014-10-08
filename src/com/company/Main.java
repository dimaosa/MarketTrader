package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello all let's start this project");
        System.out.println("Just add a line");

        ArrayList<User> users = new ArrayList<User>();

        User user1 = new User("Mark","Spilberg");
        User user2 = new User("David","macMorris");

        users.add(user1);
        users.add(user2);

        users.stream()
                .forEach(User::generatePass);

        users.stream()
                .forEach(User::info);



        //nothing to commit
    }
}
