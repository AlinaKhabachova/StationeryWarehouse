package com.alina.stationerywarehouse;

import com.alina.stationerywarehouse.containers.StationeryContainer;
import com.alina.stationerywarehouse.core.enums.Colors;
import com.alina.stationerywarehouse.core.enums.Types;
import com.alina.stationerywarehouse.core.enums.Units;
import com.alina.stationerywarehouse.products.Pen;
import com.alina.stationerywarehouse.products.Ruler;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Pen pen1 = new Pen("Pen1", 43, Colors.BLACK, Types.SIMPLE);
        Pen pen2 = new Pen("Pen2", 22, Colors.RED, Types.AUTOMATIC);

        Ruler ruler1 = new Ruler("Ruler1", 11, 40, new HashSet<>(Collections.singletonList(Units.CENTIMETER)));
        Ruler ruler2 = new Ruler("Ruler2", 54, 100, new HashSet<>(Arrays.asList(Units.CENTIMETER, Units.DECIMETER)));

        StationeryContainer stationeryContainer = new StationeryContainer();
        stationeryContainer.add(pen1);
        stationeryContainer.add(pen2);
        stationeryContainer.add(ruler1);
        stationeryContainer.add(ruler2);

        print("Origin container :");
        stationeryContainer.print();
        print("Avg price : " + stationeryContainer.avgPrice());
        print("Count : " + stationeryContainer.count());
        print("Get by index 0 : " + stationeryContainer.getByIndex(0));
        print("Get by index -1 : " + stationeryContainer.getByIndex(-1));
        stationeryContainer.sortAsc();
        print("After asc sort :");
        stationeryContainer.print();
        stationeryContainer.sortDesc();
        print("After desc sort :");
        stationeryContainer.print();

    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
