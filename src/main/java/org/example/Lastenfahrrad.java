package org.example;

public class Lastenfahrrad extends Fahrzeug {
    private int maxLoad;
    public Lastenfahrrad(String company, int km, int speed, int wheels, int maxLoad, int seats) {
        super(company, km, speed, wheels, seats);
        this.maxLoad = maxLoad;
        validate();
    }

    @Override
    public void honk() {
        System.out.println("Ring. Ring.");
    }

    protected void validate() {
        int[] temp = {km, speed, wheels, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats != 1 || wheels < 2 || maxLoad > 10000) {
                throw new IllegalArgumentException("Error in Cargo Bike configuration. You can have only 1 seat, you need more than 2 wheels and all other values need to be greater than 0.");
            }
        }
    }
}
