package org.example;

public class Lkw extends Fahrzeug{
    private boolean trailer;
    private Object motor;
    private int ps;
    private int maxLoad;
    public Lkw(String company, int km, int wheels, int speed, Object motor, int ps, int seats, boolean trailer, int maxLoad) {
        super(company, km, wheels, speed, seats);
        this.trailer = trailer;
        this.motor = motor;
        this.ps = ps;
        this.maxLoad = maxLoad;
        validate();
    }

    public void transport(Object load) {
        System.out.println(load + " wird transportiert..");
    }

    protected void validate() {
        int[] temp = {km, speed, wheels, ps, seats, maxLoad};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats >3 || wheels <6 || maxLoad > 10000) {
                throw new IllegalArgumentException("Error in LKW configuration. You can have max 3 seats, you need more than 6 wheels and all other values need to be greater than 0.");
            }
        }
    }
}