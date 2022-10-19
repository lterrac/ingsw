package ex1.set;

public class TestDrive {
    public static void main(String[] args) {
        Set s = new Set(2);
        System.out.println(s);
        s.add(1);
        System.out.println(s);
        s.add(2);
        System.out.println(s);
        s.add(3);
        System.out.println(s);
        s.delete(3);
        System.out.println(s);
        s.delete(2);
        System.out.println(s);
    }
}
