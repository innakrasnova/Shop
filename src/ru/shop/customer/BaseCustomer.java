package ru.shop.customer;

import ru.shop.interfaces.CustomerInterface;

public abstract class BaseCustomer implements CustomerInterface {

    private String name;
    private double moneyOnAccount;

    public BaseCustomer(String name, double moneyOnAccount) {
        this.name = name;
        this.moneyOnAccount = moneyOnAccount;
    }

    public void buy(){

    }
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }
}

