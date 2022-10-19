package ex3.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VettoreGenerico {
    Vector<Integer> elementi;

    /** Creates a new instance of Vettore */
    public VettoreGenerico() {
        elementi=new Vector<>();
    }

    void aggiungiElemento(Object o) throws NotValidAddException
    {
        if(o instanceof Integer)
            elementi.addElement((Integer) o);
        else
            throw new NotValidAddException();
    }

    public Vector somma(Vector v) throws Exception {
        Vector result=new Vector();
        if(elementi.size()!=v.size())
            throw new UnSummableException();
        else {
            Enumeration e1=v.elements();
            for(Enumeration e=elementi.elements(); e.hasMoreElements();)
            {
                int elem1=(((Integer)e.nextElement())).intValue();
                int elem2=((Integer)e1.nextElement()).intValue();

                result.addElement(elem1 + elem2);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        VettoreGenerico v1 = new VettoreGenerico();
        VettoreGenerico v2 = new VettoreGenerico();

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
