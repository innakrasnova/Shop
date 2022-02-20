package ru.shop.staff;

import ru.shop.interfaces.StaffInterface;

public class AbstractStaff implements StaffInterface {

    private String name;
    private String position;

    public AbstractStaff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPosition() {
        return null;
    }
    public void putOnSlelf(){

    }
    public void sell(){

    }

    public void returnMoney(){

    }
}

