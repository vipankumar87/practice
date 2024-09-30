package org.rudra.animal.fish;

public class Eel extends Fish {
    private String special;

    public Eel() {
        super();
        this.special = "Releases electric shock";
    }

    public String ShowInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
