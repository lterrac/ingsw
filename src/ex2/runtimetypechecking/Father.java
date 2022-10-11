package ex2.runtimetypechecking;


class Father { }
class Son extends Father { }

class Test {
    public static void main(String[] s) {
        Father f = new Son();
        Father f2 = new Father();
        if (f instanceof Son)
            System.out.println("True");
        else
            System.out.println("False");

        if (f instanceof Father)
            System.out.println("True");
        else
            System.out.println("False");

        if (f.getClass() == f2.getClass())
            System.out.println("True");
        else
            System.out.println("False");
    }
}
