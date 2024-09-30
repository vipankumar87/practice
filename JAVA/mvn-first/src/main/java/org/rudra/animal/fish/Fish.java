package org.rudra.animal.fish;

import org.rudra.Animal;

public class Fish extends Animal {

    protected boolean waterBone;
    protected boolean gills;

    public Fish(){
        waterBone = true;
        gills = true;
        animalType = "fish";
    }

    public String showInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
