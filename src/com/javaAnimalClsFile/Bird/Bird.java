package com.javaAnimalClsFile.Bird;

import com.javaAnimalClsFile.Animal.Animal;

public class Bird extends Animal{
    // field
    private String withFeathers = "Animals with feathers";
    private String canFly = "Can fly";

    //set numbers/strings into Animal field.
    public Bird(){
        super.setHeight(20);
        super.setWeight(2);
        super.setAnimalType("Bird");
        super.setBloodType("B");
    }

    // getter and setter
    public String getWithFeathers() {
        return this.withFeathers;
    }

    public void setWithFeathers(String withFeathers) {
        this.withFeathers = withFeathers;
    }

    public String getCanFly() {
        return this.canFly;
    }

    public void setCanFly(String canFly) {
        this.canFly = canFly;
    }
}
