package ex3.interfacesandinheritance.correct.animals;

import ex3.interfacesandinheritance.correct.migrator.Migrator;

public class Bird extends Animal implements Migrator {
    @Override
    public void whoAmI() {
        System.out.println("I am a bird");
    }

    @Override
    public void eat() {
        System.out.println("Eat meat");
    }

    @Override
    public void migrate() {
        System.out.println("Going to warmer places");
    }
}
