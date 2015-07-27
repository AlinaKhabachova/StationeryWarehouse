package com.alina.stationerywarehouse.products.core;

import java.util.Comparator;

public abstract class BaseProduct {

    private double price;

    private String name;

    public BaseProduct() {
    }

    public BaseProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public abstract String toString();

    public static Comparator<BaseProduct> ascComparator = new Comparator<BaseProduct>() {

        @Override
        public int compare(BaseProduct o1, BaseProduct o2) {
            Double result = o1.getPrice() - o2.getPrice();
            return result.intValue();
        }
    };

    public static Comparator<BaseProduct> descComparator = new Comparator<BaseProduct>() {

        @Override
        public int compare(BaseProduct o1, BaseProduct o2) {
            Double result = o2.getPrice() - o1.getPrice();
            return result.intValue();
        }
    };

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
