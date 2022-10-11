package ex2.person;

import java.util.Date;

public class Student extends Person {
    private static int idGen = 0;

    private int id;
    private static final int GRADUATION_CREDITS = 180;
    private final Grade[] grades;

    private int gradeSize;

    public Student(String name, String surname, Date birthDate) {
        super(name, surname, birthDate);
        id = idGen++;
        gradeSize = 0;
        this.grades = new Grade[10];
    }

    public void addGrade(Grade g) {
        grades[gradeSize++] = g;
    }

    public int getTotalCredits(){
        int credits = 0;
       /* for (int i = 0; i < grades.size(); i++){
            Grade g = grades.get(i); */
        for (Grade g : grades) {
            if (g == null)
                return credits;
            credits += g.getCredits();
        }
        return credits;
    }

    public boolean canGraduate(){
        /*
        int credits = getTotalCredits();
        if (credits >= GRADUATION_CREDITS)
            return true;
        else return false;
         */
        return getTotalCredits() >= GRADUATION_CREDITS;
    }

    public double getWeightedAverage(){
        double res = 0;
        for (Grade g : grades){
            if (g == null)
                return res;
            res += g.getCredits()*g.getPoints();
        }
        return res / getTotalCredits();
    }

    @Override
    public int compareTo(Object o) {
        int c = super.compareTo(o);
        if (c == 0 && o instanceof Student){
            Student student = (Student) o;
            Integer studentId = student.id;
//            return id.compareTo(studentId);
//            return studentId.compareTo(id);
//            return new Integer(id).compareTo(studentId);
            return Integer.valueOf(id).compareTo(studentId);
        }
        return c;
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a student with id " + id;
    }

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

        System.out.println(p2.compareTo((Object) s2));
    }
}
