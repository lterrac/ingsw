package ex3.interfacesandinheritance.optimized.eater;

public interface Carnivorous extends Eater {
    @Override
    public default void eat() {
        System.out.println("Eat meat");
    }
}