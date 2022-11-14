package ex5.functional;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunArrayList<T> extends ArrayList<T> {

    public <E> FunArrayList<E> map(Function<T, E> f){
        FunArrayList<E> res = new FunArrayList<>();
        for (T elem : this){
            res.add(f.apply(elem));
        }
        return res;
    }

    public FunArrayList<T> filter(Predicate<T> p){
        FunArrayList<T> res = new FunArrayList<>();
        for (T elem : this){
            if(p.test(elem)){
                res.add(elem);
            }
        }
        return res;
    }


    public <E> E reduce(BiFunction<E, T, E> f, E initialValue){
        E res = initialValue;
        for (T elem : this){
            res = f.apply(res, elem);
        }
        return res;
    }

    public FunArrayList<T> takeWhile(Predicate<T> p){
        FunArrayList<T> res = new FunArrayList<>();
        for(T elem : this){
            res.add(elem);
            if(!p.test(elem))
                break;
        }
        return res;
    }



    public String toString(){
        String res = "";
        for (T elem : this){
            res += elem.toString() + " ";
        }
        return res;
    }


    public static void main(String[] args){

        FunArrayList<Integer> s = new FunArrayList<>();
        s.add(3);
        s.add(4);
        s.add(5);
        FunArrayList<Integer> s2 = s.map((x) -> x*x);
        System.out.println(s2);

        FunArrayList<String> s3 = new FunArrayList<>();
        s3.add("ABC");
        s3.add("D");
        s3.add("EF");
        FunArrayList<Integer> s4 = s3.map((x) -> x.length());
        System.out.println(s4);


        FunArrayList<Integer> s5 = s.filter((x) -> x>4); // [5]
        System.out.println(s5);
        Integer sum = s.reduce((r, x) -> r+x, 0); // 12
        System.out.println(sum);
        Integer sum2 = s3.reduce((r, x) -> r+x.length(), 0);
        System.out.println(sum2);


    }
}
