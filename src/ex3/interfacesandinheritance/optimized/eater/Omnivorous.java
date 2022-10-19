package ex3.interfacesandinheritance.optimized.eater;

import java.util.Random;

public interface Omnivorous extends Eater {
    @Override
    public default void eat() {
        String s = "Eat ";
        Random r = new Random();
        s += r.nextBoolean() ? "meat" : "veggies";
        System.out.println(s);
    }
}