package ex3.interfacesandinheritance.correct.eater;

//No! ricadiamo nello stesso problema della versione precedente!
//public class Homnivor extends Carnivorous, Herbivor{
//}

import java.util.Random;

public interface Omnivorous extends Eater {
}
//    @Override
//    public void eat() {
//        String s = "Eat ";
//        Random r = new Random();
//        s += r.nextBoolean() ? "meat" : "veggies";
//        System.out.println(s);
//    }
//}