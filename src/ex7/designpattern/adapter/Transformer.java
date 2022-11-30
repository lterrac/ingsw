package ex7.designpattern.adapter;

public interface Transformer {

    Volt get220Volt();
    Volt get12Volt();
    Volt get3Volt();

}
