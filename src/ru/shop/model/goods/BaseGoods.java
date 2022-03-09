package ru.shop.model.goods;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.interfaces.CategoryInterface;

public abstract class BaseGoods implements GoodsInterface {

    private String name;
    private double price;
    private String unit;
    private double quantity;
    private boolean defect;
    private CategoryInterface section;

    public BaseGoods(String name, double price, String unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public BaseGoods(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public CategoryInterface getSection() { return section; }
    public void setSection(CategoryInterface section) { this.section = section; }
    public boolean hasDefect() { return defect; }
    public void setHasDefect(boolean defect) { this.defect = defect; }

    @Override
    public String toString() {
        return name + " - " +  + quantity + " " + unit;
    }
}
