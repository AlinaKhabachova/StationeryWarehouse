package com.alina.stationerywarehouse.products;

import com.alina.stationerywarehouse.core.enums.Colors;
import com.alina.stationerywarehouse.core.enums.Types;
import com.alina.stationerywarehouse.products.core.BaseProduct;

public class Pen extends BaseProduct {

    private Colors inkColor;

    private Types type;

    public Pen() {
    }

    public Pen(String name, double price, Colors inkColor, Types type) {
        super(name, price);
        this.inkColor = inkColor;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", inkColor=" + inkColor +
                ", type=" + type +
                '}';
    }

    public Colors getInkColor() {
        return inkColor;
    }

    public void setInkColor(Colors inkColor) {
        this.inkColor = inkColor;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
}
