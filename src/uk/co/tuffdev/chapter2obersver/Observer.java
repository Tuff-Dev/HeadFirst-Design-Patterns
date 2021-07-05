package uk.co.tuffdev.chapter2obersver;

/**
 * created 05/07/2021
 *
 * @author Will Tuffin
 */
public interface Observer {

    void updateAndReceiveData(float temp, float humidity, float pressure);
    void update();

}
