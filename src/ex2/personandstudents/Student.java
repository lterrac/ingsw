package ex2.personandstudents;

import java.util.Date;

public class Student extends Person{
    private static int idGen = 0;
    private int id;
    private final static int GRADUATION_CREDITS = 180;
    private Grade[] grades;
    private int gradeSize;

    public Student(String name, String surname, Date birthDate) {
        super(name, surname, birthDate);
        id = idGen++;
        gradeSize = 0;
        grades = new Grade[10];
    }

    public void addGrade(Grade g) {
        grades[gradeSize++] = g;
    }

    public boolean canGraduate() {
        return getTotalCredits() >= GRADUATION_CREDITS;
    }

    public int getTotalCredits() {
        int credits = 0;
        for (int i = 0; i < gradeSize; i++) {
            credits += grades[i].getCredits();
        }
        return credits;
    }

    public double getWeightedAverage() {
        double res = 0;

        for (Grade g: grades) {
            if (g == null) {
                return res / getTotalCredits();
            }
            res += g.getCredits() * g.getPoints();
        }
        return res / getTotalCredits();
    }

    @Override
    public int compareTo(Object o) {
        int c = super.compareTo(o);

        if(c == 0 && o instanceof Student) {
            Student s = (Student) o;
            Integer studentId = s.id;
            return Integer.valueOf(id).compareTo(studentId);
        }

        return c;
    }

    public static void main(String[] args) {
        Person p0 = new Person("Mario", "Rossi", new Date());
        Person p1 = new Person("Rossi", "Mario", new Date());

        System.out.println(p0.compareTo(p1));

        Student s1 = new Student("Pippo", "a", new Date());

        System.out.println(s1.canGraduate());
        System.out.println(s1.getTotalCredits());
        System.out.println(s1.getWeightedAverage());

        Person p2 = s1;


//        System.out.println(p2.);
    }
}
