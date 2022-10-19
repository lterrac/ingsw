package ex3.collections;

import java.util.*;

public class TestDrive {
    public static void main(String[] args) {
//
        ArrayList list = new ArrayList();
        list.add(new Object());
        list.add(new String("ciao"));
        list.add(false);

        System.out.println(list);
        String s = (String) list.get(1);
        System.out.println(s);

        list.add(1, 0);
        s = (String) list.get(1);
        System.out.println(s);

        LinkedList<Integer> ls = new LinkedList<>();
        List<Integer> l = ls;
        Queue<Integer> q= ls;
        Deque<Integer> dq = ls;

//        l.contains(0);
//        l.poll();
//        q.poll();
//        dq.addLast(0);
//        q.addLast();
    }
}
