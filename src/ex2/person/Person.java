package ex2.person;

import java.util.Date;

public class Person implements Comparable {
    private final String name;
    private final String surname;
    private final Date birthDate;

    public Person(String name, String surname, Date birthDate) {
//        if (name == null || birthday == null)
//            throw new IllegalArgumentException();
        this.name = name;
        this.surname = surname;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "I am " + name + " " + surname;
    }

    //    @Override
    public int compareTo(Person o) {
        int c1 = surname.compareTo(o.surname);
        int c2 = name.compareTo(o.name);
        if (c1 > 0 || (c1 == 0 && c2 > 0))
            return 1;
        else if (c1 == 0 && c2 == 0)
            return 0;
        return -1;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person))
            return 0;

        return compareTo((Person) o);
    }
}
