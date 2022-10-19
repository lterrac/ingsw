package ex3.codaillimitata;

public class StringaAccodabile implements Accodabile{
    private String s;

    StringaAccodabile(String s){
        this.s=s;
    }

    public boolean confrontaClasse(Object o){
        return o.getClass() == StringaAccodabile.class;
    }
}
