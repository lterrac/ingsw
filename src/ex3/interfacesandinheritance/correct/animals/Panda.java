package ex3.interfacesandinheritance.correct.animals;

import ex3.interfacesandinheritance.correct.eater.Herbivor;
import ex3.interfacesandinheritance.correct.hibernater.Hibernater;
import ex3.interfacesandinheritance.correct.migrator.Migrator;

import java.util.Random;

public class Panda extends Animal implements Herbivor, Hibernater, Migrator {
    @Override
    public void whoAmI() {
        System.out.println("I am a panda");
    }

    @Override
    public void eat() {
        String s = "Eat ";
        Random r = new Random();
        s += r.nextBoolean() ? "meat" : "veggies";
        System.out.println(s);
    }

    @Override
    public void migrate() {
        System.out.println("Going to warmer places");
    }

    @Override
    public void hibernate() {
        System.out.println("Hibernate for the winter");
    }
}
