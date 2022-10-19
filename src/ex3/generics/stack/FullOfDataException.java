package ex3.generics.stack;

public class FullOfDataException extends Exception{
    public String message() {
        return "Ops! Troppi dati";
    }
}
