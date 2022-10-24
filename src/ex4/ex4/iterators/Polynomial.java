package ex4.iterators;

import java.util.Iterator;

public class Polynomial implements Iterable<Float> {

    private float[] terms;

    public Polynomial(float[] terms){
        this.terms = terms;
    }

    public int getDegree(){
        return terms.length-1;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < terms.length; i++){
            String term = termToString(terms[i], i);
            res = term + res;
        }
        return res;
    }

    private String termToString(float term, int deg){

        String res;

        if (term < 0)
            res = String.valueOf(term);
        else if (term == 0)
            return "";
        else {
            res = "+"+term;
        }

        if (deg == 1) {
            res = res + "x";
        }
        else if (deg > 1){
            res = res + "x^"+deg;
        }
        return res;
    }


    @Override
    public Iterator<Float> iterator() {
        return new PolyIterator();
    }

    private class PolyIterator implements Iterator<Float> {

        int i = 0;

        @Override
        public boolean hasNext() {
            return i <= getDegree();
        }

        @Override
        public Float next() {
            return terms[i++];
        }
    }

    public static void main(String[] args){
        float terms[] = {1, -2.0f, 0, 3};
        Polynomial p = new Polynomial(terms);
        System.out.println(p);

        for(float c : p){
            System.out.println(c);
        }
    }
}
