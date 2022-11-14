package ex5.multithreading;

public class Producer implements Runnable {
    private Account account;
    private final int time, max;
    public Producer(Account account, int time, int max){
        this.account = account;
        this.time = time;
        this.max = max;
    }

    @Override
    public void run() {
        while(true){

            int amount = (int) (Math.random()*max);
            synchronized (account) {
                account.deposit(amount);
                System.out.println("Depositato: " + amount);
                System.out.println("Saldo: " + account.getAmount());
            }
            try {
                Thread.sleep(time*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
