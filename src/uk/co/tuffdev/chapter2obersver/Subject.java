package uk.co.tuffdev.chapter2obersver;

/**
 * created 05/07/2021
 *
 * @author Will Tuffin
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
