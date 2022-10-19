package ex3.interfacesandinheritance.optimized.animals;

import ex3.interfacesandinheritance.optimized.eater.Carnivorous;
import ex3.interfacesandinheritance.optimized.eater.Eater;
import ex3.interfacesandinheritance.optimized.hibernater.Hibernater;

public class Bear extends Animal implements Carnivorous, Hibernater {
    @Override
    public void whoAmI() {
        System.out.println("I am a bear");
    }
}