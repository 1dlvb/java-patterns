package ru.patterns.factory;

/**
 * Factory for creating transport for a logistic purposes.
 * You can use it with any transport that implements Transport interface or interfaces extends Transport.
 * How do Factory works? We create factory interface with createObject method. Implementation of this interface
 * creates instances of some classes. Classes should implement some basic interface.
 * To specify methods for classes other than those of the Transport interface, create a new interface that extends from
 * the Transport interface. This new interface (or Transport) should be passed as a parameter to a LogisticFactory
 * @param <T> T extends Transport interface.
 */
public interface LogisticsFactory<T extends Transport> {

    /**
     * @return instance of transport
     */
    T createTransport();

}
