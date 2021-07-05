package uk.co.tuffdev.chapter2obersver.observers;

import uk.co.tuffdev.chapter2obersver.DisplayElement;
import uk.co.tuffdev.chapter2obersver.Observer;
import uk.co.tuffdev.chapter2obersver.WeatherData;

/**
 * created 05/07/2021
 *
 * @author Will Tuffin
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void updateAndReceiveData(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
