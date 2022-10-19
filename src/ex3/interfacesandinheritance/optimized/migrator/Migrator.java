package ex3.interfacesandinheritance.optimized.migrator;

public interface Migrator {
    public default void migrate() {
        System.out.println("Going to warmer places");
    }
}
