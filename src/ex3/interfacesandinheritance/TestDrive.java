package ex3.interfacesandinheritance;

import ex3.interfacesandinheritance.optimized.animals.Animal;
import ex3.interfacesandinheritance.optimized.animals.Bear;
import ex3.interfacesandinheritance.optimized.animals.Bird;
import ex3.interfacesandinheritance.optimized.animals.Panda;
import ex3.interfacesandinheritance.optimized.eater.Carnivorous;
import ex3.interfacesandinheritance.optimized.eater.Eater;

import java.util.ArrayList;

public class TestDrive {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Bear bear = new Bear();
        Panda panda = new Panda();
        Bird bird = new Bird();
        animals.add(bear);
        animals.add(panda);
        animals.add(bird);
//
//        bear.whoAmI();
//        bear.eat();
//        bear.hibernate();
//
//        panda.whoAmI();
//        panda.eat();
//        panda.hibernate();
//        panda.migrate();
//
//        bird.whoAmI();
//        bird.eat();
//        bird.migrate();
//
        for(Animal a: animals) {
            a.whoAmI();
        }

        ArrayList<Eater> eaters = new ArrayList<>();
        eaters.add(bear);
        eaters.add(panda);
        eaters.add(bird);

        for (Eater a: eaters)
            a.eat();

        ArrayList<Carnivorous> carnivorous = new ArrayList<>();
        carnivorous.add(bear);
//        carnivorous.add(panda);
//        carnivorous.add(bird);

        for (Carnivorous a: carnivorous)
            a.eat();

    }
}
