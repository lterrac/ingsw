package ex2.immutablestrings;

public class TestDrive {
    public static void main(String[] args) {
        String a = "a";
        String c = "a";
        String d = new String("a");

        System.out.println(a == c);
        System.out.println(a.equals(c));

        System.out.println(a == d);
        System.out.println(a.equals(d));

        String s1 = "Guess who";
        String s2 = s1;
        String s3 = "ABC";
        s1 = s1 + " is back";
        s1 = s3;
        System.out.println(s1);
        System.out.println(s2);
    }
}
