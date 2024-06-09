package ru.patterns.factory;

/**
 * Implementation for of RollingTransport interface for trucks
 */
public class Truck implements RollingTransport {

    private final int cruisingSpeed = 100;
    @Override
    public void deliver() {
        System.out.println("Delivering by truck...");
    }

    @Override
    public void roll() {
        System.out.printf("The truck [%s] is rolling.\n", this);
    }

    @Override
    public void accelerate() {

        for (int currentSpeed = 0; currentSpeed < cruisingSpeed; currentSpeed += 50) {
            System.out.printf("The car is accelerating. The cruisingSpeed is %s km/h...\n", currentSpeed);
        }

    }

    @Override
    public void brake() {

        for (int currentSpeed = cruisingSpeed; currentSpeed > 0; currentSpeed -= 50) {
            System.out.printf("The car is breaking. The cruisingSpeed is %s km/h...\n", currentSpeed);
        }
    }

}
