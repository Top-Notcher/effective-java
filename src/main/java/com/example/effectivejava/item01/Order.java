package com.example.effectivejava.item01;

import java.util.Arrays;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;
    private OrderStatus orderStatus;


    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }
    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Order order = new Order();
        if(order.orderStatus == OrderStatus.DELIVERED){ // equals를 쓴다면 nullpointException이 발생
            System.out.println("delivered");
        }
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
    }
}
