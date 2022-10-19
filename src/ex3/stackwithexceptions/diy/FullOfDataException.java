package ex3.stackwithexceptions.diy;

public class FullOfDataException extends Exception{
    public String message() {
        return "Ops, troppi dati!";
    }
}
