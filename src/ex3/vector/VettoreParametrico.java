package ex3.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VettoreParametrico<T extends Integer> {
    Vector<T> elementi;

    /** Creates a new instance of Vettore */
    public VettoreParametrico() {
        elementi=new Vector<>();
    }

    void aggiungiElemento(Object o) throws NotValidAddException
    {
        if(o != null)
//            if(o instanceof T)
            elementi.addElement((T) o);
        else
            throw new NotValidAddException();
    }

    public Vector<T> somma(Vector<T> v) throws Exception {
        Vector<T> result=new Vector<>();
        if(elementi.size()!=v.size())
            throw new UnSummableException();
        else {
            Enumeration<T> e1=v.elements();
            for(Enumeration<T> e = elementi.elements(); e.hasMoreElements();)
            {
                int elem1= e.nextElement().intValue();
                int elem2= e1.nextElement().intValue();

                result.addElement((T) Integer.valueOf(elem1 + elem2));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        VettoreParametrico<Integer> v1 = new VettoreParametrico<>();
        VettoreParametrico<Integer> v2 = new VettoreParametrico<>();

//        try {
//            v1.aggiungiElemento(new Object());
//        } catch (NotValidAddException e) {
//            System.out.println("Non posso aggiungere un Object");
//        }

        try {
            v1.aggiungiElemento(1);
            v1.aggiungiElemento(2);
        } catch (NotValidAddException e) {
            throw new RuntimeException(e);
        }

        try {
            v2.aggiungiElemento(1);
            v2.aggiungiElemento(2);
        } catch (NotValidAddException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(v1.somma(v2.elementi));;
        } catch (Exception e) {
            System.out.println("Non posso sommare i due vettori");
        }
    }
}
