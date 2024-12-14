package org.example;

public class Pkw extends Fahrzeug {
    public Pkw(String company, int km, int speed, Object motor, int ps, int seats) {
        super(company, km, speed, 4, motor, ps, seats);
        validate(km, "Km");
        validate(speed, "Speed");
        validate(ps, "PS");
        validate(seats, "seats");
    }

    public void driveFullSpeed() {
        System.out.println("Wruum!");
    }
}