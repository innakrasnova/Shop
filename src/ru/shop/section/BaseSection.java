package ru.shop.section;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.interfaces.SectionInterface;
import ru.shop.interfaces.StaffInterface;

import java.util.ArrayList;

public abstract class BaseSection implements SectionInterface {

    private String name;
    private ArrayList<StaffInterface> staffList = new ArrayList<StaffInterface>();
    private ArrayList<GoodsInterface> goodsListOfSection = new ArrayList<GoodsInterface>();

   public String getName() {
        return name;
    }

   public ArrayList<StaffInterface> getStaffList() {
        return staffList;
    }

   public ArrayList<GoodsInterface> getGoodsListOfSection() {
        return goodsListOfSection;
    }

   public void addStaff(StaffInterface staff){
        staff.setSection (this);
        staffList.add(staff);
    }

   public void addGoods (GoodsInterface goods){
        goods.setSection (this);
        goodsListOfSection.add(goods);
    }
}
