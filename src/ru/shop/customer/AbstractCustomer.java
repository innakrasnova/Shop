package ru.shop.customer;

import ru.shop.interfaces.CustomerInterface;

public class AbstractCustomer implements CustomerInterface {

    private String name;
    private double moneyOnAccount;

    public void buy(){

    }
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }
}

