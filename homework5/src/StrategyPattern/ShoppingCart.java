package StrategyPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: ShoppingCart
 * @date 2021/11/21 11:07
 */
public class ShoppingCart {
    private final Map<String, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getId(), item.getPrice());
    }

    public void removeItem(Item item) {
        items.remove(item.getId());
    }

    public int calculateTotal() {
        int price = 0;
        for (int i : items.values()) {
            price += i;
        }
        return price;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }
}
