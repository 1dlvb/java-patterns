package ru.patterns.factory;

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

