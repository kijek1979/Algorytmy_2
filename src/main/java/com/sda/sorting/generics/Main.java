package com.sda.sorting.generics;

//import sun.net.www.content.text.Generic;

import com.sda.sorting.generics.classes.Car;
import com.sda.sorting.generics.classes.Truck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("name" , "Audi", 1);
        GenericBox<String> box = new GenericBox();
        box.whatsInTheBox();

        GenericPair<String, Integer> genericPair = new GenericPair<>("Cos", 213);
        String val1 = genericPair.getLewy();
        int val2 = genericPair.getPrawy();

        double wynik = countSum(123.0, 123123L);
    }

    public static <T extends Number, E extends Number> double countSum(T lewy, E prawy){
        return lewy.doubleValue() + prawy.doubleValue();
    }

    public static <T> void doSomething(T parametr) {
        System.out.println(parametr);
    }

    public static <T> List<T> addToList(T parametr) {

        List<T> list = new ArrayList<>();
        list.add(parametr);

        return list;
    }

    public static <T> List<T> addToList(T... parametr) {
        List<T> wynik = new ArrayList<>(Arrays.asList(parametr));
//        List<T> wynik = new ArrayList<>();
//        for (T element: parametr){
//            wynik.add(element);
//        }
        return wynik;
    }
}
