package ru.shop.interfaces;

import java.util.ArrayList;

public interface SectionInterface {

    String getName();
    ArrayList<StaffInterface> getStaffList();
    ArrayList<GoodsInterface> getGoodsListOfSection();

}
