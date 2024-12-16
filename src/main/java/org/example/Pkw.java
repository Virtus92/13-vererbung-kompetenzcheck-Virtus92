package org.example;

public class Pkw extends Fahrzeug {
    public Pkw(String company, int km, int speed, int wheels, Object motor, int ps, int seats) {
        super(company, km, speed, wheels, motor, ps, seats);
        super.validatePkw();
    }

    public void driveFullSpeed() {
        System.out.println("Wruum!");
    }
}