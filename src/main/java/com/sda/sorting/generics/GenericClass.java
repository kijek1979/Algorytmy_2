package com.sda.sorting.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    private List<T> objects = new ArrayList<>();

    public T getsomething(int index){
        return objects.get(index);
    }

    public static void main(String[] args) {
        sumValues(2.3d, 2.5d);
    }

    public static <X extends Number> double sumValues(X one, X two){
        return one.doubleValue() + two.doubleValue();
    }
}
