package ex7.designpattern.observable;

public class WeatherStation {

    public WeatherStation(){
        WeatherData data = new WeatherData();
        WeatherDisplay display = new WeatherDisplay();
        data.registerObserver(display);

        data.setMeasurementes(1, 2, 3);
        data.setMeasurementes(4,5,6);
    }

    public static void main(String[] args){
        new WeatherStation();
    }
}
