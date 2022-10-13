package com.javaAnimalClsFile.Crocodile;

import com.javaAnimalClsFile.Reptile.Reptile;

public class Crocodile extends Reptile {
    // field
    private String hardShelledEggs = "Hard-shelled-eggs";

    // getter and setter
    public String getHardShelledEggs() {
        return this.hardShelledEggs;
    }

    public void setHardShelledEggs(String hardShelledEggs) {
        this.hardShelledEggs = hardShelledEggs;
    }
    
    // showInfo method for Crocodile
    public void showInfo(){
        System.out.println(this.getHardShelledEggs());
        System.out.println(super.getDrySkin());
        System.out.println(super.getBackbone());
        System.out.println(super.getSoftShelledEggs());
        System.out.println(super.getHeight());
        System.out.println(super.getWeight());
        System.out.println(super.getAnimalType());
        System.out.println(super.getBloodType());
    }
}
