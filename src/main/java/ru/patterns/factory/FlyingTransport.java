package ru.patterns.factory;

/**
 * An interface covering all kind of flying transport
 * Should be used, when your aircraft is only flying.
 * Do not use with amphibian aircraft.
 * @author Matushkin Anton
 */
public interface FlyingTransport extends Transport {

    /**
     * Method should be used, when aircraft is taking off.
     */
    void takeOff();

    /**
     * Method should be used, when aircraft gained cruising speed.
     */
    void fly();

    /**
     * Method should be used, when aircraft is started landing.
     */
    void land();

}

