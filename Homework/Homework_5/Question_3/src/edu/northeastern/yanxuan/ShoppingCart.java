package edu.northeastern.yanxuan;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public int calculateTotal() {
        int total = 0;
        for (Item i : itemList) {
            total += i.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy payment) {
        payment.pay(calculateTotal());
    }
}
