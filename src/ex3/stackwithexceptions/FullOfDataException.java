package ex3.stackwithexceptions;

public class FullOfDataException extends Exception{
    public String message() {
        return "Ops! Troppi dati";
    }
}
