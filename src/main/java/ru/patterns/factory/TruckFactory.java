package ru.patterns.factory;

/**
 * Factory class, that should be used to create instances of Trucks
 * @author Matushkin Anton
 */
public class TruckFactory implements LogisticsFactory<RollingTransport> {

    @Override
    public RollingTransport createTransport() {
        return new Truck();
    }

}
