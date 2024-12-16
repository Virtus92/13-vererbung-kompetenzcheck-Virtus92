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
    private boolean isPushed = false;
    LocalDateTime startTime = LocalDateTime.now();


    //Lastenfahrrad
    public Fahrzeug(String company, int km, int speed, int wheels, int maxLoad) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
        this.seats = 1;
        this.maxLoad = maxLoad;
    }

    //Fahrrad
    public Fahrzeug(String company, int km, int speed, int wheels, int seats, boolean isPushed) {
        this.company = company;
        this.km = km;
        this.speed = speed;
        this.wheels = wheels;
        this.seats = seats;
        this.isPushed = isPushed;
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
        double duration = (double) km / speed;
        if (isPushed) {
            duration = km;
        }
        int minutes = (int) ((duration * 60) % 60);
        System.out.printf("You need %.0f hours and %2d minutes.\n", duration, minutes);
        String arrival = startTime.plusHours((long) duration).plusMinutes(minutes).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.printf("You arrive at %s at %s.\n", B, arrival);
        startTime = startTime.plusHours((long) duration).plusMinutes(minutes);
        this.km += km;
    }

    public int getKm() {
        return km;
    }


    protected void validate() {
        int[] temp = {km, speed, wheels, ps, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0) {
                throw new IllegalArgumentException("Error, all values must be greater than 0.");
            }
        }
    }

    protected void validatePkw() {
        int[] temp = {km, speed, wheels, ps, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats >7 || wheels <4) {
                throw new IllegalArgumentException("Error in PKW configuration. You can have max 7 seats, you need more than 4 wheels and all other values need to be greater than 0.");
            }
        }
    }

    protected void validateLkw() {
        int[] temp = {km, speed, wheels, ps, seats, maxLoad};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats >3 || wheels <6 || maxLoad > 10000) {
                throw new IllegalArgumentException("Error in LKW configuration. You can have max 3 seats, you need more than 6 wheels and all other values need to be greater than 0.");
            }
        }
    }

    protected void validateBike() {
        int[] temp = {km, speed, wheels, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats >2 || wheels < 2) {
                throw new IllegalArgumentException("Error in Bike configuration. You can have max 2 seats, you need more than 2 wheels and all other values need to be greater than 0.");
            }
        }
    }

    protected void validateCargoBike() {
        int[] temp = {km, speed, wheels, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats != 1 || wheels < 2 || maxLoad > 10000) {
                throw new IllegalArgumentException("Error in Cargo Bike configuration. You can have only 1 seat, you need more than 2 wheels and all other values need to be greater than 0.");
            }
        }
    }


}
