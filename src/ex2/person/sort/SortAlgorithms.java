package ex2.person.sort;

import ex2.person.Person;

public class SortAlgorithms {
    public static void sortAscending(Comparable[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i].compareTo((Object) v[j]) > 0) {
                    Comparable tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
    }

    public static void PersonSortAscending(Comparable<Person>[] v) {
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
}
