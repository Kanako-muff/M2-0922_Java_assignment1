package com.javaAnimalClsFile.Eagle;

import com.javaAnimalClsFile.Bird.Bird;

public class Eagle extends Bird{
    // showInfo method for Eagle
    public void showInfo(){
        System.out.println(super.getWithFeathers());
        System.out.println(super.getCanFly());
        System.out.println(super.getHeight());
        System.out.println(super.getWeight());
        System.out.println(super.getAnimalType()); 
        System.out.println(super.getBloodType());
    }
}
