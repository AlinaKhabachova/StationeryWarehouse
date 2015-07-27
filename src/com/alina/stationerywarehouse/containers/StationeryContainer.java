package com.alina.stationerywarehouse.containers;

import com.alina.stationerywarehouse.products.core.BaseProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StationeryContainer {

    private List<BaseProduct> products = new ArrayList<>();

    public StationeryContainer() {
    }

    public StationeryContainer(List<BaseProduct> products) {
        if (products != null) {
            this.products = products;
        }
    }

    public void add(BaseProduct product) {
        if (product != null) {
            this.products.add(product);
        }
    }

    public int count() {
        return this.products.size();
    }

    public BaseProduct getByIndex(int index) {
        if (index > this.products.size() - 1 || index < 0) {
            return null;
        } else {
            return products.get(index);
        }
    }

    public void sortAsc() {
        Collections.sort(this.products, BaseProduct.ascComparator);
    }

    public void sortDesc() {
        Collections.sort(this.products, BaseProduct.descComparator);
    }

    public double avgPrice() {
        double sum = 0;
        for (BaseProduct value : this.products) {
            sum += value.getPrice();
        }
        return this.products.isEmpty() ? 0 : (sum / this.products.size());
    }

    public void print() {
        this.products.forEach(value -> System.out.println(value.toString()));
    }
}
