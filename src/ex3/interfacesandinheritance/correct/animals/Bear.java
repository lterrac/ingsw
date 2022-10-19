package ex3.interfacesandinheritance.correct.animals;

import ex3.interfacesandinheritance.correct.hibernater.Hibernater;

public class Bear extends Animal implements Hibernater {
    @Override
    public void whoAmI() {
        System.out.println("I am a bear");
    }

    @Override
    public void eat() {
        System.out.println("Eat meat");
    }
    @Override
    public void hibernate() {
        System.out.println("Hibernate for the winter");
    }
}