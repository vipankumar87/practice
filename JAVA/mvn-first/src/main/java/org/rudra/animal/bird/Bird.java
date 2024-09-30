package org.rudra.animal.bird;

import org.rudra.Animal;

public class Bird extends Animal {
    protected boolean feather;
    protected boolean canFly;

    public Bird() {
        super();
        animalType = "bird";
        feather = true;
        canFly = true;
    }
}
