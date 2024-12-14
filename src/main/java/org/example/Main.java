package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fahrzeug> list = new ArrayList<>();
        Object motor = new Object();
        Fahrrad bike1 = new Fahrrad("MTB", 100, 30, 1);
        Lastenfahrrad lBike1 = new Lastenfahrrad("KTM", 200, 20, 4);
        Pkw auto1 = new Pkw("BMW", 100000, 130, motor, 300, 4);
        Lkw lkw1 = new Lkw("Mercedes", 100000, 6, 200, motor, 200, 3, true, 20);

        list.add(bike1);
        list.add(lBike1);
        list.add(auto1);
        list.add(lkw1);

//        auto1.drive("Linz", "Wien", 180);

        for (int i = 0; i<list.size(); i++) {
            System.out.println();
            System.out.println(i + ".) ");
            list.get(i).honk();
            list.get(i).drive("Linz", "Wien", 180);
            list.get(i).drive("Wien", "Graz", 200);
            list.get(i).drive("Graz", "Linz", 220);
        }
    }
}