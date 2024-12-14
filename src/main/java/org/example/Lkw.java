package org.example;

public class Lkw extends Fahrzeug{
    public Lkw(String company, int km, int wheels, int speed, Object motor, int ps, int seats, boolean trailer, int maxLoad) {
        super(company, km, wheels, speed, motor, ps, seats, trailer, maxLoad);
    }

    public void transport(Object load) {
        System.out.println(load + " wird transportiert..");
    }
}