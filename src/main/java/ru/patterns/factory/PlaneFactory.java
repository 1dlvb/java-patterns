package ru.patterns.factory;

/**
 * Factory class, that should be used to create instances of Planes
 * @author Matushkin Anton
 */
public class PlaneFactory implements LogisticsFactory<FlyingTransport> {

    @Override
    public FlyingTransport createTransport() {
        return new Plane();
    }

}
