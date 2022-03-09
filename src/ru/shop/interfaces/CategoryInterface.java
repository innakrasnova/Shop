package ru.shop.interfaces;

import java.util.ArrayList;

public interface CategoryInterface {
    /**
     * возвращает наименование категории
     * @return {@code String} наименование категории
     */
    String getName();
    ArrayList<GoodsInterface> getGoodsListOfCategory();

}
