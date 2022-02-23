package ru.shop.goods;

public class BakeryGoods extends  BaseGoods {

    public BakeryGoods(String name, double price, String unit) {
        super(name, price, unit);
    }

    public BakeryGoods(String name, double quantity) {
        super(name, quantity);
    }
}