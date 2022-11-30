package ex7.designpattern.adapter;

public class Volt {

    private int amount;

    public Volt(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
