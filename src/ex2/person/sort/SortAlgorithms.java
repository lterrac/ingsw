package ex2.person.sort;

import ex2.person.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SortAlgorithms {
    public static List<Comparable> sortAscending(List<Comparable> v) {
        List<Comparable> result = new ArrayList<>();
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).compareTo((Object) v.get(j)) > 0) {
                    Comparable tmp = v.get(j);
                    v.add(i, v.get(j));
                    v.add(j, tmp);
                }
            }
        }

        return result;
    }
    public static void sortAscending1(Comparable<Person>[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i].compareTo((Person) v[j]) > 0) {
                    Comparable<Person> tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
    }
    public static <T> void sortAscending2(Comparable<T>[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i].compareTo((T) v[j]) > 0) {
                    Comparable<T> tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void sortAscending3(Comparable<T>[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i].compareTo((T) v[j]) > 0) {
                    Comparable<T> tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void sortAscending4(T[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i].compareTo(v[j]) > 0) {
                    T tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args){
//        List<Comparable<Person>> persons = new ArrayList<>();
        List<Comparable> persons = new ArrayList<>();
        persons.add(new Person("B", "B", new Date()));
        persons.add(new Person("A", "A", new Date()));

        System.out.println(sortAscending(persons));

    }
}
