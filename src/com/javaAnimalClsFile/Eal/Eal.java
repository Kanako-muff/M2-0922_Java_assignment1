package com.javaAnimalClsFile.Eal;

import com.javaAnimalClsFile.Fish.Fish;

public class Eal extends Fish{
    // field
    private String electricCharge = "Release electric charge";

    // getter and setter
    public String getElectricCharge() {
        return this.electricCharge;
    }

    public void setElectricCharge(String electricCharge) {
        this.electricCharge = electricCharge;
    }

    // showInfo method for Eal
    public void showInfo(){
        System.out.println(this.getElectricCharge());
        System.out.println(super.getLivaInWater());
        System.out.println(super.getHasGills());
        System.out.println(super.getHeight());
        System.out.println(super.getWeight());
        System.out.println(super.getAnimalType());
        System.out.println(super.getBloodType());
    }
}
