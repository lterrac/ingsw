package ex3.interfacesandinheritance.optimized.animals;

import ex3.interfacesandinheritance.optimized.eater.Omnivorous;
import ex3.interfacesandinheritance.optimized.migrator.Migrator;

public class Bird extends Animal implements Omnivorous, Migrator {
    @Override
    public void whoAmI() {
        System.out.println("I am a bird");
    }

}
