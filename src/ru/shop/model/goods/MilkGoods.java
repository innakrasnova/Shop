package ru.shop.model.goods;

public class MilkGoods extends BaseGoods{

    public MilkGoods(String name, double price, String unit) {
        super(name, price, unit);
    }

    public MilkGoods(String name, int quantity) {
        super(name, quantity);
    }

    public MilkGoods() {
        super("milk", 0);
    }
}
