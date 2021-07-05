package uk.co.tuffdev.chapter2obersver;

import java.util.ArrayList;
import java.util.List;

/**
 * created 05/07/2021
 *
 * @author Will Tuffin
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
//        observers.forEach(observer -> observer.updateAndReceiveData(getTemperature(), getHumidity(), getPressure()));
        observers.forEach(Observer::update);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

}
