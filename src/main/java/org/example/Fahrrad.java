package org.example;

public class Fahrrad extends Fahrzeug{
    public Fahrrad(String company, int km, int speed, int seats, boolean isPushed) {
        super(company, km, speed, 2, seats, isPushed);
        super.validateBike();
    }

    @Override
    public void honk() {
        System.out.println("Ring. Ring.");
    }
}
