package uk.co.tuffdev.chapter2obersver;

import uk.co.tuffdev.chapter2obersver.observers.CurrentConditionsDisplay;

/**
 * created 05/07/2021
 *
 * @author Will Tuffin
 */
public class Test {

  public static void main(String[] args) {
      WeatherData weatherData = new WeatherData();

      CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

      weatherData.setMeasurements(75, 70, 30.1f);
  }
}
