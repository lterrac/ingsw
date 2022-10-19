package ex3.sortwithgenerics;

import java.util.Date;

public class CorrectPerson implements Comparable<CorrectPerson> {
    private final String name;
    private final String surname;
    private final Date birthDate;

    public CorrectPerson(String name, String surname, Date birthDate) {
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

    @Override
    public int compareTo(CorrectPerson o) {
        int c1 = surname.compareTo(o.surname);
        int c2 = name.compareTo(o.name);
        if (c1 > 0 || (c1 == 0 && c2 > 0))
            return 1;
        else if (c1 == 0 && c2 == 0)
            return 0;
        return -1;
    }

}
