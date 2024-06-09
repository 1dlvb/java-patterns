package ru.patterns.factory;

public interface RollingTransport extends Transport {

    /**
     * Method should be used, when rolling transport gained cruising speed
     */
    void roll();

    /**
     * Method should be used to accelerate rolling transport
     */
    void accelerate();

    /**
     * Method should be used to brake rolling transport
     */
    void brake();

}
