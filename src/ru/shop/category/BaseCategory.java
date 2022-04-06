package ru.shop.category;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.interfaces.CategoryInterface;

import java.util.LinkedList;

public abstract class BaseCategory implements CategoryInterface {

    private String name;
    private LinkedList<GoodsInterface> goodsListOfCategory = new LinkedList<>();

   public String getName() {
        return name;
    }

   public LinkedList<GoodsInterface> getGoodsListOfCategory() {
        return goodsListOfCategory;
    }

   public void addGoods (GoodsInterface goods){
        goods.setSection (this);              //спросить почему this
        goodsListOfCategory.add(goods);
    }
}
