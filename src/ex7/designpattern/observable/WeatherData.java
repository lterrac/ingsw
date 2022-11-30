package ex7.designpattern.observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

    List<Observer> observerList = new ArrayList<>();
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    public void setMeasurementes(float temperature,
                                 float humidity,
                                 float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList)
            o.update(temperature, humidity, pressure);
    }
}
