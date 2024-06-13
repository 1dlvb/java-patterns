package ru.patterns.proxy;

/**
 * Interface for handling payments
 * @author Matushkin Anton
 */
public interface Payment {

    /**
     * @return true if payment was successful
     */
    Boolean pay();

}
