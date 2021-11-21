package StrategyPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Item
 * @date 2021/11/21 11:00
 */
public class Item {
    private final String id;
    private final int price;

    public Item(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
