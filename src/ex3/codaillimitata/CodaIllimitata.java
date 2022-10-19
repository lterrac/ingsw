package ex3.codaillimitata;

import java.util.Vector;

public class CodaIllimitata {

    private Vector c;

    CodaIllimitata() {
        c = new Vector();
    }

    public Vector getC() {
        return c;
    }

    public void insert (Object x) throws NonValidObjectException {
        Accodabile a;
        try {
            a = (Accodabile)x;
        }
        catch (Exception e){
            System.out.println("Oggetto non accodabile");
            throw new NonValidObjectException();
        }

        if (!c.isEmpty() && !a.confrontaClasse(c.firstElement())){
            System.out.println("Oggetto del tipo sbagliato");
            throw new NonValidObjectException();
        }

        c.addElement(x);
        System.out.println("Oggetto inserito");
    }

    public static void main(String[] args) {
        CodaIllimitata ci = new CodaIllimitata();
        try {
            StringaAccodabile el = new StringaAccodabile("Primo elemento");
            ci.insert(el);
        } catch (NonValidObjectException e) {
            e.printStackTrace();
        }

        StringaAccodabile el2  = new StringaAccodabile("Secondo elemento");

        InteroAccodabile el3 = new InteroAccodabile(5);
        try {
            ci.insert(el2);
            ci.insert(el3);
        } catch (NonValidObjectException e2) {
            e2.printStackTrace();
        }

        System.out.println("termine main");
        System.out.println("Stato coda");
        System.out.println(ci.getC());
    }
}