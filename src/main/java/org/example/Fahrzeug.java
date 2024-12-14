package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Fahrzeug {
    private String company;
    private int km;
    private int speed;
    private int wheels;
    private Object motor;
    private int ps;
    private int seats;
    private boolean trailer;
    private int maxLoad;
    LocalDateTime startTime = LocalDateTime.now();


    //Lastenfahrrad
    public Fahrzeug(String company, int km, int speed, int wheels) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
    }

    //Fahrrad
    public Fahrzeug(String company, int km, int speed, int wheels, int seats) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
        this.seats = seats;
    }

    //Auto
    public Fahrzeug(String company, int km, int speed, int wheels, Object motor, int ps, int seats) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
        this.motor = motor;
        this.ps = ps;
        this.seats = seats;
    }

    //Lkw
    public Fahrzeug(String company, int km, int wheels, int speed, Object motor, int ps, int seats, boolean trailer, int maxLoad) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
        this.motor = motor;
        this.ps = ps;
        this.seats = seats;
        this.trailer = trailer;
        this.maxLoad = maxLoad;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }

    public void drive(String A, String B, int km) {
        String formattedDate = startTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.printf("You are in %s at %s.\n", A, formattedDate);
        double duration = (double) km /speed;
        int minutes = (int) ((duration*60)%60);
        System.out.printf("You need %.0f hours and %2d minutes.\n", duration, minutes);
        String arrival = startTime.plusHours((long) duration).plusMinutes(minutes).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.printf("You arrive at %s at %s.\n", B, arrival);
        startTime = startTime.plusHours((long) duration).plusMinutes(minutes);
        this.km += km;
    }

    public int getKm() {
        return km;
    }

    protected void validate(double value, String fieldName) {
        if (value <=0) {
            throw new IllegalArgumentException(fieldName + " must be greater than 0.");
        }
    }

}
