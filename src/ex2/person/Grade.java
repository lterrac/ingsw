package ex2.person;

public class Grade {

    private final int points;
    private final int credits;

    public Grade(int points, int credits){
        this.points = points;
        this.credits = credits;
    }

    public int getPoints() {
        return points;
    }

    public int getCredits() {
        return credits;
    }
}