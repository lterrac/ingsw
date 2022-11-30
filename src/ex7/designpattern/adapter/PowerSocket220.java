package ex7.designpattern.adapter;

public class PowerSocket220 {

    public Volt getVolt(){
        return new Volt(220);
    }

}
