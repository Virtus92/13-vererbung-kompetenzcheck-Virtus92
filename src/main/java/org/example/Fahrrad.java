package org.example;

public class Fahrrad extends Fahrzeug{
    private boolean isPushed = false;
    public Fahrrad(String company, int km, int speed, int seats, boolean isPushed) {
        super(company, km, speed, 2, seats);
        this.isPushed = isPushed;
        validate();
    }

    @Override
    public void honk() {
        System.out.println("Ring. Ring.");
    }

    protected void validate() {
        int[] temp = {km, speed, wheels, seats};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= 0 || seats >2 || wheels < 2) {
                throw new IllegalArgumentException("Error in Bike configuration. You can have max 2 seats, you need more than 2 wheels and all other values need to be greater than 0.");
            }
        }
    }
}
