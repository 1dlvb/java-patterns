package ru.patterns.factory;

/**
 * An interface covering all kind of rolling transport.
 * Should be used, when your transport is only rolling.
 * Do not use with amphibian transport.
 * @author Matushkin Anton
 */
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
