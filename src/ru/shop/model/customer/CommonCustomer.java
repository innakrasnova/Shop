package ru.shop.model.customer;

import ru.shop.interfaces.GoodsInterface;

public class CommonCustomer extends BaseCustomer {

    private boolean discount = false;

    public CommonCustomer(String name, double moneyOnAccount) {
        super(name, moneyOnAccount);
    }

    @Override
    public void addGoodsInBasket(GoodsInterface goods) {
    }
}
