package ex7.designpattern.observable;

public class WeatherDisplay implements Observer{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println(temp+","+humidity+","+pressure);
    }


}
