package com.tutorial.command.thirdSample;

public class Main {
    public static void main(String[] args) {

        StockInvoker stockInvoker = new StockInvoker();
        stockInvoker.takeOrder(new SellStock(new Stock()));
        stockInvoker.takeOrder(new BuyStock(new Stock()));

        stockInvoker.placeOrders();
    }
}
