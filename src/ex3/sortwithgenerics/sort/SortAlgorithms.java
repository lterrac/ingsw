package ex3.sortwithgenerics.sort;

import ex3.sortwithgenerics.CorrectPerson;
import ex3.sortwithgenerics.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SortAlgorithms {
    public static List<Comparable> sortAscending(List<Comparable> v) {
        List<Comparable> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).compareTo(result.get(j)) > 0) {
                    Comparable tmp1 = result.get(j);
                    Comparable tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }

        return result;
    }
    public static List<Comparable<Person>> sortAscending1(List<Comparable<Person>> v) {
        List<Comparable<Person>> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).compareTo((Person) result.get(j)) > 0) {
                    Comparable<Person> tmp1 = result.get(j);
                    Comparable<Person> tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }
        return result;
    }

    public static List<Comparable<CorrectPerson>> sortAscending1Bis(List<Comparable<CorrectPerson>> v) {
        List<Comparable<CorrectPerson>> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).compareTo((CorrectPerson) result.get(j)) > 0) {
                    Comparable<CorrectPerson> tmp1 = result.get(j);
                    Comparable<CorrectPerson> tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }
        return result;
    }



    public static <T> List<Comparable<T>> sortAscending2(List<Comparable<T>> v) {
        List<Comparable<T>> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).compareTo((T) result.get(j)) > 0) {
                    Comparable<T> tmp1 = result.get(j);
                    Comparable<T> tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }
        return result;
    }

    public static <T extends Comparable<T>> List<Comparable<T>> sortAscending3(List<Comparable<T>> v) {
        List<Comparable<T>> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                T second = (T) result.get(j);
                if (v.get(i).compareTo(second) > 0) {
                    Comparable<T> tmp1 = result.get(j);
                    Comparable<T> tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }
        return result;
    }
    public static <T extends Comparable<T>> List<T> sortAscending4(List<T> v) {
        List<T> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).compareTo(result.get(j)) > 0) {
                    T tmp1 = result.get(j);
                    T tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }
        return result;
    }

    public static <T> List<T> sortAscending5(List<T> v) {
        List<T> result = new ArrayList<>(v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                Comparable<T> first = (Comparable<T>) v.get(i);
                if (first.compareTo(result.get(j)) > 0) {
                    T tmp1 = result.get(j);
                    T tmp2 = result.get(i);
                    result.remove(j);
                    result.remove(i);
                    result.add(i, tmp1);
                    result.add(j, tmp2);
                }
            }
        }
        return result;
    }



    public static void main(String[] args){
//        List<Comparable<Person>> persons = new ArrayList<>();
//        List<Comparable> persons = new ArrayList<>();
//        persons.add(new Person("D", "C", new Date()));
//        persons.add(new Person("A", "B", new Date()));
//        System.out.println(sortAscending(persons));
//
//        List<Comparable<Person>> persons1 = new ArrayList<>();
//        persons1.add(new Person("D", "C", new Date()));
//        persons1.add(new Person("A", "B", new Date()));
//        System.out.println(sortAscending1(persons1));
//        System.out.println(sortAscending2(persons1));
//        System.out.println(sortAscending3(persons1));
//
//        List<Comparable<Person>> persons3 = new ArrayList<>();
//        persons3.add(new Person("D", "C", new Date()));
//        persons3.add(new Person("A", "B", new Date()));
//        System.out.println(sortAscending3(persons3));
//
        List<Person> persons4 = new ArrayList<>();
        persons4.add(new Person("D", "C", new Date()));
        persons4.add(new Person("A", "B", new Date()));
        List<Person> finalPerson = sortAscending4(persons4);
        System.out.println(finalPerson);
        System.out.println(sortAscending4(persons4));


        List<CorrectPerson> persons5 = new ArrayList<>();
        persons5.add(new CorrectPerson("D", "C", new Date()));
        persons5.add(new CorrectPerson("A", "B", new Date()));
        System.out.println(sortAscending4(persons5));

        List<Comparable<CorrectPerson>> persons6 = new ArrayList<>();
        persons5.add(new CorrectPerson("D", "C", new Date()));
        persons5.add(new CorrectPerson("A", "B", new Date()));
        System.out.println(sortAscending1Bis(persons6));
        System.out.println(sortAscending2(persons6));
        System.out.println(sortAscending3(persons6));
    }
}
