package ex5.multithreading;

public class Account {
    private int amount;

    public Account(int amount){
        this.amount = amount;
    }

    public synchronized void deposit(int x){
        amount += x;
    }

    public synchronized boolean collect(int x){
        if (amount < x){
            return false;
        }
        amount = amount - x;
        return true;
    }

    public synchronized int getAmount(){
        return amount;
    }

    public static void main(String[] args){
        Account a = new Account(500);
        Producer p = new Producer(a, 5, 200);
        Consumer c1 = new Consumer(a, 1, 300);
        Consumer c2 = new Consumer(a, 3, 200);

        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();

    }

}
