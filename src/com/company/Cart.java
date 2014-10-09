package com.company;

import java.util.ArrayList;

/**
 * Created by dimao on 10/1/14.
 */
class Cart{
    protected ArrayList<Order> orders;

    protected void addOrder(Order order){
        orders.add(order);
    }
    protected void cancelOrder(Order order){
        orders.remove(order);
    }
    protected void cancelOrder(int index){
        orders.remove(index);
    }
    protected void showOrders(){
        orders.stream()
                .forEach(Order::show);
    }
}
