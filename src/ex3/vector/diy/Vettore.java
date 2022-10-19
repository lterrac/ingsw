//package ex3.vector.diy;
//
//
//import java.util.Enumeration;
//import java.util.Vector;
//
//public class Vettore<T extends Comparable> {
//
//    Vector<T> elementi;
//
//    public Vettore() {
//        this.elementi = new Vector<>();
//    }
//
//    void aggiungiElemento(Object o) throws NotValidAddException {
//        if(o != null) {
//            elementi.add((T) o);
//        } else
//            throw new NotValidAddException();
//    }
//
//    public Vector<T> somma(Vector<T> v) throws Exception {
//        Vector<T> result = new Vector<>();
//
//        if (elementi.size() != v.size()) {
//            throw new UnSummableException();
//        } else {
//            Enumeration<T> el = v.elements();
//            for (Enumeration<T> e=elementi.elements(); e.hasMoreElements();) {
//                T elem1 = e.nextElement();
//                T elem2 = el.nextElement();
//
//                result.add(elem1 + elem2);
//            }
//        }
//
//        return result;
//
//    }
//
//    public static void main(String[] args) {
//        Vettore v1 = new Vettore();
//        Vettore v2 = new Vettore();
//
//        try {
//            v1.aggiungiElemento(new Object());
//        } catch (NotValidAddException e) {
//            System.out.println("Non posso aggiungere un Object");
//        }
//
//        try {
//            v1.aggiungiElemento(1);
//            v1.aggiungiElemento(2);
//        } catch (NotValidAddException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            v2.aggiungiElemento(1);
//            v2.aggiungiElemento(2);
//        } catch (NotValidAddException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            System.out.println(v1.somma(v2.elementi));;
//        } catch (Exception e) {
//            System.out.println("Non posso sommare i due vettori");
//        }
//    }
//}
//
//
