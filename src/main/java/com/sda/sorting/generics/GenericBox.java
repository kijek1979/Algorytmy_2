package com.sda.sorting.generics;

import com.sda.sorting.generics.classes.ICar;

public class GenericBox<T> {
    private T content;

    public GenericBox() {
    }

    public GenericBox(T content) {
        this.content = content;
    }

//    public void driveTheVehicle(){
//        content.drive();
//    }

    public void whatsInTheBox(){
        if(content == null){
            System.out.println("The box is empty");
        }else {
            System.out.println("The box contains: " + content);
        }
    }
}
