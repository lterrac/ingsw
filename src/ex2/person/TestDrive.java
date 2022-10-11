package ex2.person;

import java.util.Date;

public class TestDrive {
    public static void main(String[] args) {
        Person p0 = new Person("Post", "Malone", new Date());
        Person p1 = new Person("Malone", "Post", new Date());

        System.out.println(p0.compareTo(p1));

        Student s1 = new Student("Mario", "Rossi", new Date());

        System.out.println(s1.canGraduate());
        System.out.println(s1.getTotalCredits());
        System.out.println(s1.getWeightedAverage());


        Student s2 = new Student("Rossi", "Mario", new Date());
        Student s3 = new Student("Rossi", "Mario", new Date());

        Person p2 = new Student("Rossi", "Mario", new Date());
    }
}
