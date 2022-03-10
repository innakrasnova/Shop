package ru.shop.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public interface CategoryInterface {
    /**
     * возвращает наименование категории
     * @return {@code String} наименование категории
     */
    String getName();

    LinkedList<GoodsInterface> getGoodsListOfCategory();

}
