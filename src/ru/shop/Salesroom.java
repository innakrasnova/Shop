package ru.shop;

import ru.shop.interfaces.CustomerInterface;

import java.util.ArrayList;

public class Salesroom {

    public static final String SHOP_NAME = "Shop";
    private ArrayList<CustomerInterface> customerList = new ArrayList<CustomerInterface>();

    public void addCustomer(CustomerInterface customer){
        customerList.add(customer);
    }
}
