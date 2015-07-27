package com.alina.stationerywarehouse.products;

import com.alina.stationerywarehouse.core.enums.Units;
import com.alina.stationerywarehouse.products.core.BaseProduct;

import java.util.Set;

public class Ruler extends BaseProduct {

    private double lengthCentimeters;

    private Set<Units> units;

    public Ruler() {
    }

    public Ruler(String name, double price, double lengthCentimeters, Set<Units> units) {
        super(name, price);
        this.lengthCentimeters = lengthCentimeters;
        this.units = units;
    }

    @Override
    public String toString() {
        return "Ruler{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", lengthCentimeters=" + lengthCentimeters +
                ", units=" + units +
                '}';
    }

    public double getLengthCentimeters() {
        return lengthCentimeters;
    }

    public void setLengthCentimeters(double lengthCentimeters) {
        this.lengthCentimeters = lengthCentimeters;
    }

    public Set<Units> getUnits() {
        return units;
    }

    public void setUnits(Set<Units> units) {
        this.units = units;
    }
}
