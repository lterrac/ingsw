package ex3.interfacesandinheritance.wrong.eater;


import java.util.Random;

public abstract class Eater {

    public abstract void eat();

    class Carnivorous extends Eater {
        @Override
        public void eat() {
            System.out.println("Eat meat");
        }
    }

    class Herbivore extends Eater {
        @Override
        public void eat() {
            System.out.println("Eat veggies");
        }
    }

//    class Omnivorous extends Carnivorous, Herbivore {
    class Omnivorous extends Eater {
    @Override
    public void eat() {
        String s = "Eat ";
        Random r = new Random();
        s += r.nextBoolean() ? "meat" : "veggies";
        System.out.println(s);
    }
    }
}
