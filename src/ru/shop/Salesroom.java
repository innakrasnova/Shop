package ru.shop;

import ru.shop.interfaces.CustomerInterface;
import ru.shop.interfaces.CategoryInterface;

import java.util.ArrayList;

public class Salesroom {

    public static final String SHOP_NAME = "Shop";
    private ArrayList<CustomerInterface> customerList = new ArrayList<>();
    private ArrayList<CategoryInterface> sectionList = new ArrayList<>();


    public ArrayList<CategoryInterface> getSectionList() {
        return sectionList;
    }

    public void addCustomer(CustomerInterface customer){
        customerList.add(customer);
    }

    public void addSection(CategoryInterface section){
        sectionList.add(section);
    }

}
