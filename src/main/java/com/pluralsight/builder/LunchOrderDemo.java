package com.pluralsight.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Mayo");
        LunchOrder order = builder.build();
        System.out.print(order.getBread());
        System.out.print(order.getCondiments());
        System.out.print(order.getDressings());
        System.out.print(order.getMeat());
    }
}
