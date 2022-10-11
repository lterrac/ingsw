package ex2.cron;

public class Op1 implements Actionable{
    @Override
    public void doIt() {
        System.out.println("This is OP1");
    }
}
