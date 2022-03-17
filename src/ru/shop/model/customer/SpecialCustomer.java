package ru.shop.model.customer;

import ru.shop.interfaces.GoodsInterface;

public class SpecialCustomer extends BaseCustomer {

    private boolean discount = true;

    public SpecialCustomer(String name, double moneyOnAccount) {
        super(name, moneyOnAccount);
    }

    @Override
    public void addGoodsInBasket(GoodsInterface goods) {
        }
}
