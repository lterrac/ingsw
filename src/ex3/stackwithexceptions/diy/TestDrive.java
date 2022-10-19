package ex3.stackwithexceptions.diy;


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

        try {
//            for (int i = 0; i < 3; i++) {
            for (int i = 0; i < 4; i++) {
                System.out.println(s.pop());
                System.out.println(s);
            }
        } catch (OutOfDataException e) {
            e.printStackTrace();
        } finally {
            System.out.println(s);
        }

//        try {
////            for (int i = 0; i < 3; i++) {
//            for (int i = 0; i < 4; i++) {
//                System.out.println(s.pop());
//                System.out.println(s);
//            }
//        } catch (OutOfDataException e) {
//            System.out.println("out of data exception");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("eccezione generica");
//        } finally {
//            System.out.println(s);
//        }
//
//        System.out.println(2 + 2);

//    }

    }
}
