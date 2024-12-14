package org.example;

public class Lastenfahrrad extends Fahrzeug {
    public Lastenfahrrad(String company, int km, int speed, int wheels) {
        super(company, km, speed, wheels);
    }

    @Override
    public void honk() {
        System.out.println("Ring. Ring.");
    }
}
