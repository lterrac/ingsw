package ex3.interfacesandinheritance.correct.animals;

import ex3.interfacesandinheritance.correct.eater.Carnivorous;
import ex3.interfacesandinheritance.correct.eater.Eater;

public abstract class Animal implements Eater {
    public abstract void whoAmI();
}
//    public class CarnivorousEater extends Animal, Carnivorous{}
//
//public abstract class Animal extends Eater, Hibernater, Migrator {
//    public abstract void whoAmI();
//
//    public class Bear extends Animal, Carnivorous {
//
//    }
//}
