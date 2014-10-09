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


        blankline();
        printInfo(users);
        blankline();
        Iterator it = users.iterator();
        users.get(users.indexOf(user1)).setName("George");

        printInfo(users);
        //nothing to commit
    }

    public static void printInfo(ArrayList<User> users){
        users.stream()
                .forEach(User::info);

    }
    public static void blankline(){
        System.out.println();
    }

}
