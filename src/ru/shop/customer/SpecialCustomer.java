package ru.shop.customer;

public class SpecialCustomer extends BaseCustomer {

    private boolean discount = true;

    public SpecialCustomer(String name, double moneyOnAccount) {
        super(name, moneyOnAccount);
    }
}
