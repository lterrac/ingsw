package ex2.accessmodifiers.b;

import ex2.accessmodifiers.a.C1;

public class C2 extends C1 {
    public void m1() {
        System.out.print("4");
        m2();
        m3();
    }

    protected void m2() {
        System.out.print("5");
    }

    private void m3() {
        System.out.print("6");
    }
}

//public class C2 extends C1{
//    public void m1() {
//        System.out.print("4");
//        m2();
//        m3();
//    }
//
//    protected void m2() {
//        System.out.print("5");
//    }
//
//}

//
//public class C2 extends C1 {
//    public void m1() {
//        System.out.print("4");
//        m2();
//        m3();
//    }
//
//    private void m3() {
//        System.out.print("6");
//    }
//}