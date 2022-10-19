package ex3.interfacesandinheritance.optimized.animals;

import ex3.interfacesandinheritance.optimized.migrator.Migrator;
import ex3.interfacesandinheritance.optimized.eater.Herbivor;
import ex3.interfacesandinheritance.optimized.hibernater.Hibernater;

public class Panda extends Animal implements Herbivor, Hibernater, Migrator {
    @Override
    public void whoAmI() {
        System.out.println("I am a panda");
    }
}
