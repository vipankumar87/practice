package org.rudra.animal.reptile;

import org.rudra.Animal;

public class Raptile extends Animal {
    protected  String skin,egg;
    protected boolean backBone;

    public Raptile(){
        skin = "Dry Skin";
        this.backBone = true;
        this.egg = "soft shelled";
        heightInFeet = 5;
        weightInKilos = 30;
        animalType = "Raptile";
        bloodType = "cold";
    }

    public String showInfo() {
        return "Raptile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backBone=" + backBone +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
