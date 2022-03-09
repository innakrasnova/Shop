package ru.shop.model.customer;

public class CommonCustomer extends BaseCustomer {

    private boolean discount = false;

    public CommonCustomer(String name, double moneyOnAccount) {
        super(name, moneyOnAccount);
    }
}
