package ru.shop.interfaces;

public interface GoodsInterface {

    String getName();

    double getPrice();

    double getQuantity();

    String getUnit();

    SectionInterface getSection();

    boolean hasDefect();

    void setSection(SectionInterface section);

    String toString();
}
