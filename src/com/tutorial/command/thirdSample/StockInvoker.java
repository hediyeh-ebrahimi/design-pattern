package com.tutorial.command.thirdSample;

import java.util.ArrayList;
import java.util.List;

public class StockInvoker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        this.orderList.forEach(Order::execute);
        this.orderList.clear();
    }
}
