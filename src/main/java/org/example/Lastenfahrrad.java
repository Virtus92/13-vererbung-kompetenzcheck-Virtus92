package org.example;

public class Lastenfahrrad extends Fahrzeug {
    public Lastenfahrrad(String company, int km, int speed, int wheels, int maxLoad) {
        super(company, km, speed, wheels, maxLoad);
        super.validateCargoBike();
    }

    @Override
    public void honk() {
        System.out.println("Ring. Ring.");
    }
}
