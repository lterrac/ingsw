package ex4.strings;

public class StringBufferTest {

    public static void main(String[] args){
        int numIterations = 2500000;
        String sA = "";

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < numIterations; i++){
            sA += "a";
        }
        long timeTot = System.currentTimeMillis() - t1;
        System.out.println(timeTot);

        StringBuffer sB = new StringBuffer();

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < numIterations; i++){
            sB.append("a");
        }
        timeTot = System.currentTimeMillis() - t2;
        System.out.println(timeTot);


    }
}
