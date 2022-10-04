package ex1.stack;

public class TestDrive {
    public static void main(String[] args) {
        Stack s = new Stack(2);
        System.out.println(s);
        s.push(1);
        System.out.println(s);
        s.push(2);
        System.out.println(s);
        s.push(3);
        System.out.println(s);
        s.push(4);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

    }
}
