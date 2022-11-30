package ex7.designpattern.observable;

public interface Observable {

    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();

}
