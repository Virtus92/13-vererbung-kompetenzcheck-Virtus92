package org.example;

public class Pkw extends Fahrzeug {
    private Object motor;
    private int ps;
    public Pkw(String company, int km, int speed, int wheels, Object motor, int ps, int seats) {
        super(company, km, speed, wheels, seats);
        this.motor = motor;
        this.ps = ps;
        validate();
    }

    public void driveFullSpeed() {
        System.out.println("Wruum!");
    }

    protected void validate() {
        int[] temp = {km, speed, wheels, ps, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats >7 || wheels <4) {
                throw new IllegalArgumentException("Error in PKW configuration. You can have max 7 seats, you need more than 4 wheels and all other values need to be greater than 0.");
            }
        }
    }
}