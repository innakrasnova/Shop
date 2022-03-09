package ru.shop.section;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.interfaces.CategoryInterface;

import java.util.ArrayList;

public abstract class BaseSection implements CategoryInterface {

    private String name;
    private ArrayList<GoodsInterface> goodsListOfSection = new ArrayList<GoodsInterface>();

   public String getName() {
        return name;
    }

   public ArrayList<GoodsInterface> getGoodsListOfSection() {
        return goodsListOfSection;
    }


   public void addGoods (GoodsInterface goods){
        goods.setSection (this);
        goodsListOfSection.add(goods);
    }
}
