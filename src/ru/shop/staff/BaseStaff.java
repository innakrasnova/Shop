package ru.shop.staff;

import ru.shop.interfaces.SectionInterface;
import ru.shop.interfaces.StaffInterface;

public abstract class BaseStaff implements StaffInterface {

    private String name;
    private SectionInterface section;

    public BaseStaff(String name, SectionInterface section) {
        this.name = name;
        this.section = section;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SectionInterface getSection() {
        return section;
    }

    public void setSection(SectionInterface section) {
        this.section = section;
    }

    public void sell(){

    }

    public void returnMoney(){

    }
}

