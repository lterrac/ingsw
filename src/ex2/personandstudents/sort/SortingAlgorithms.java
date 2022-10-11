package ex2.personandstudents.sort;

public class SortingAlgorithms {
//    Questi warning vedremo come evitarli dopo aver visto i generici e le
//    funzioni parametriche
    public static void sortAscending(Comparable[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i].compareTo(values[j]) > 0) {
                    Comparable tmp = values[i];
                    values[i] = values[j];
                    values[j] = tmp;
                }
            }
        }
    }
}
