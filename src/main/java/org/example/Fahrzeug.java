package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Fahrzeug {
    protected String company;
    protected int km;
    protected int speed;
    protected int wheels;
    protected int seats;

    LocalDateTime startTime = LocalDateTime.now();

    public Fahrzeug(String company, int km, int speed, int wheels, int seats) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
        this.seats = 1;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }

    public void drive(String A, String B, int km) {
        String formattedDate = startTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.printf("You are in %s at %s.\n", A, formattedDate);
        double duration = (double) km / speed;
        int minutes = (int) ((duration * 60) % 60);
        System.out.printf("You need %.0f hours and %2d minutes.\n", duration, minutes);
        String arrival = startTime.plusHours((long) duration).plusMinutes(minutes).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.printf("You arrive at %s at %s.\n", B, arrival);
        startTime = startTime.plusHours((long) duration).plusMinutes(minutes);
        this.km += km;
    }
}
