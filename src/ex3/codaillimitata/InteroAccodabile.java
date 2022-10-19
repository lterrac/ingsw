package ex3.codaillimitata;

public class InteroAccodabile implements Accodabile{
    private int intero;

    InteroAccodabile(int i){
        intero=i;
    }

    public boolean confrontaClasse(Object o) {
        return o.getClass() == InteroAccodabile.class;
    }
}

