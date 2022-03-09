package ru.shop.model.goods;

public class MilkGoods extends BaseGoods{

    public MilkGoods(String name, double price, String unit) {
        super(name, price, unit);
    }

    public MilkGoods(String name, double quantity) {
        super(name, quantity);
    }
}
