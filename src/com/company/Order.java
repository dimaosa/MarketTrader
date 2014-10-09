package com.company;

/**
 * Created by dimao on 10/8/14.
 */
public class Order {
    Product product;

    public Order(String name, double price) {
        product.name = name;
        product.price = price;
    }

    public String getName() {
        return product.name;
    }

    public void setName(String name) {
        product.name = name;
    }

    public double getPrice() {
        return product.price;
    }

    public void setPrice(double price) {
        product.price = price;
    }

    protected void show(){
       System.out.format("Name: " + product.name + "\n"
                       + "Price: " + product.price + "\n");
   }


/*
public void placeOrder(){


}
*/

}
