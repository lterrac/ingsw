package ex1.competition;

public class Singer {
    private String name;
    private String surname;
    private String birthplace;
    private String birthdate;
    private String song;

    public Singer(String name, String surname, String birthplace, String birthdate, String song) {
        this.name = name;
        this.surname = surname;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
        this.song = song;
    }

    public Singer() {}
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getSong() {
        return song;
    }

    public int compareTo(Singer s) {
        int n = surname.compareTo(s.surname);

        if (n == 0) {
            n = name.compareTo(s.name);
        }

        return n;
    }

    public boolean isLessThan(Singer s) {
        return compareTo(s) < 0;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public boolean equals(Singer s) {
        return surname.equals(s.getSurname()) &&
                name.equals(s.getName()) &&
                birthdate.equals(s.getBirthdate()) &&
                birthplace.equals(s.getBirthplace());
    }
}
