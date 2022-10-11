package ex2.personandstudents;

import java.util.Date;

public class Person implements Comparable {
    private final String name;

    private final String surname;
    private final Date birthDate;

    public Person(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "I am " + name;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person))
            return 0;

        return compareTo((Person) o);
    }

    public int compareTo(Person p) {
        int c1 = surname.compareTo(p.surname);
        int c2 = name.compareTo(p.name);

        if (c1 > 0 || c1 == 0 && c2 > 0)
            return 1;
        else if (c1 == 0 && c2 == 0)
            return 0;
        else
            return -1;
    }
}
