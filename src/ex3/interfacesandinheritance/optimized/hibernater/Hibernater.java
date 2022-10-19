package ex3.interfacesandinheritance.optimized.hibernater;

public interface Hibernater {
    public default void hibernate() {
        System.out.println("Hibernate for the winter");
    }
}
