package com.kodilla.good.patterns.challenges;

public class Order {
    Item item;
    User user;
    int quantity;


    public Order(User user, Item item,  int quantity) {
        this.item = item;
        this.user = user;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
