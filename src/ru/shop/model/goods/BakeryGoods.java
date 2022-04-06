package ru.shop.model.goods;

public class BakeryGoods extends BaseGoods {

    public BakeryGoods(String name, double price, String unit) {
        super(name, price, unit);
    }

    public BakeryGoods(String name, int quantity) {
        super(name, quantity);
    }

    public BakeryGoods() {
        super("bread", 0);
    }
}