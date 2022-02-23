package ru.shop;

import ru.shop.interfaces.CustomerInterface;
import ru.shop.interfaces.SectionInterface;

import java.util.ArrayList;

public class Salesroom {

    public static final String SHOP_NAME = "Shop";
    private ArrayList<CustomerInterface> customerList = new ArrayList<>();
    private ArrayList<SectionInterface> sectionList = new ArrayList<>();


    public ArrayList<SectionInterface> getSectionList() {
        return sectionList;
    }

    public void addCustomer(CustomerInterface customer){
        customerList.add(customer);
    }

    public void addSection(SectionInterface section){
        sectionList.add(section);
    }

}
