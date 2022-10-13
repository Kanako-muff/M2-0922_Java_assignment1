package com.javaAnimalClsFile.Fish;

import com.javaAnimalClsFile.Animal.Animal;

public class Fish extends Animal  {
    // field
    private String livaInWater = "Live in water";
    private String hasGills = "Has gills";

    //set numbers/strings into Animal field.
    public Fish(){
        super.setHeight(30);
        super.setWeight(3);
        super.setAnimalType("Fish");
        super.setBloodType("A");
    }

    //getter and setter
    public String getLivaInWater() {
        return this.livaInWater;
    }

    public void setLivaInWater(String livaInWater) {
        this.livaInWater = livaInWater;
    }

    public String getHasGills() {
        return this.hasGills;
    }

    public void setHasGills(String hasGills) {
        this.hasGills = hasGills;
    }

}
