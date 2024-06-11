package ru.patterns.factory;

/**
 * An interface to work with all kind of logistic transport.
 * @author Matushkin Anton
 */
public interface Transport {

    /**
     * Method should be used for delivery using special transport.
     */
    void deliver();

}
