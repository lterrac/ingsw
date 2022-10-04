package ex1.competition;

public class TestDrive {
    public static void main(String[] args) {
        Singer s1 = new Singer("Post", "Malone", "New York", "1995", "Rockstar");
        Singer s2 = new Singer("Janis", "Joplin", "Texas", "1943", "Cry Baby");
        Singer s3 = new Singer("Michael", "Jackson", "Indiana", "1958", "Thriller");

        System.out.println(s1.isLessThan(s2));
        System.out.println(s2.isLessThan(s3));

        Competition c = new Competition("Emmy", "Los Angeles", "Jim Carrey", "1/1/2022", "3/1/2022");
        c.addSinger(s2);
        System.out.println(c.generateRanking());
        c.addSinger(s3);
        System.out.println(c.generateRanking());
        c.addSinger(s1,1);
        System.out.println(c.generateRanking());

        c.deleteSinger("Joplin", "Janis");
        System.out.println(c.generateRanking());
        System.out.println("--------------------------------");
        System.out.println(c.generateOrderedList());
    }
}
