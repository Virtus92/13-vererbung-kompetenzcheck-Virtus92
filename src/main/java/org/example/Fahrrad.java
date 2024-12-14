package org.example;

public class Fahrrad extends Fahrzeug{
    public Fahrrad(String company, int km, int speed, int seats) {
        super(company, km, speed, 2, seats);
        validate(km, "Km");
        validate(speed, "Speed");
        validate(seats, "seats");
    }

    @Override
    public void honk() {
        System.out.println("Ring. Ring.");
    }
}
