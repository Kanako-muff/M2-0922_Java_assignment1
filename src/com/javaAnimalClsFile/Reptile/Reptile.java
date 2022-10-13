package com.javaAnimalClsFile.Reptile;

import com.javaAnimalClsFile.Animal.Animal;

public class Reptile extends Animal{
    // field
    private String drySkin = "DrySkin";
    private String backbone = "Backborn";
    private String softShelledEggs = "Soft-shelled eggs";

    //set numbers/strings into Animal field.
    public Reptile(){
        super.setHeight(40);
        super.setWeight(100);
        super.setAnimalType("Reptile");
        super.setBloodType("B");
    }

    //getter and setter
    public String getDrySkin() {
        return this.drySkin;
    }

    public void setDrySkin(String drySkin) {
        this.drySkin = drySkin;
    }

    public String getBackbone() {
        return this.backbone;
    }

    public void setBackbone(String backbone) {
        this.backbone = backbone;
    }

    public String getSoftShelledEggs() {
        return this.softShelledEggs;
    }

    public void setSoftShelledEggs(String softShelledEggs) {
        this.softShelledEggs = softShelledEggs;
    }
}