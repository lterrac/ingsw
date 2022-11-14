package ex5.multithreading;

public class Consumer implements Runnable {
    private Account account;
    private final int time, max;
    public Consumer(Account account, int time, int max){
        this.account = account;
        this.time = time;
        this.max = max;
    }

    @Override
    public void run() {
        while(true){
            int amount = (int) (Math.random()*max);
            synchronized (account){
                if(account.collect(amount)){
                   System.out.println("Prelevato: "+amount);
                }
                else {
                    System.out.println("Fondi non sufficienti");
                }
                System.out.println("Saldo: "+account.getAmount());
            }
            try {
                Thread.sleep(time*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
