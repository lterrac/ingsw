package ex7.designpattern.adapter;

public class PowerSocketAdapter implements Transformer {

    private PowerSocket220 ps;

    public PowerSocketAdapter(PowerSocket220 ps){
        this.ps = ps;
    }

    @Override
    public Volt get220Volt() {
        return ps.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = ps.getVolt();
        volt.setAmount(12);
        return volt;
    }

    @Override
    public Volt get3Volt() {
        Volt volt = ps.getVolt();
        volt.setAmount(3);
        return volt;
    }
}
