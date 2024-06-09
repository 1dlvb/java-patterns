package ru.patterns.factory;

/**
 * Implementation of FlyingTransport interface for planes.
 */
public class Plane implements FlyingTransport {

    private final int cruisingSpeed = 300;
    @Override
    public void deliver() {
        System.out.println("delivering by plane...");
    }

    @Override
    public void takeOff() {
        for (int currentSpeed = 0; currentSpeed < cruisingSpeed; currentSpeed += 100) {
            System.out.printf("Acceleration on takeoff. Speed is %d km/h...\n", currentSpeed);
        }
        System.out.println("The plane took off successfully.");
    }

    @Override
    public void fly() {
        System.out.printf("The plane[%s] is flying.\n", this);
    }

    @Override
    public void land() {
        for (int currentSpeed = cruisingSpeed; currentSpeed > 0; currentSpeed -= 100) {

            System.out.printf("Slowing down on landing... Speed is %d km/h...\n", currentSpeed);
        }
        System.out.println("The plane landed successfully.");
    }

}
