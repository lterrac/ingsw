package ex3.interfacesandinheritance.optimized.eater;

public interface Herbivor extends Eater {
    @Override
    public default void eat() {
        System.out.println("Eat veggies");
    }
}