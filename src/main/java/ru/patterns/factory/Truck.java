package ru.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Implementation for of RollingTransport interface for trucks
 * @author Matushkin Anton
 */

public class Truck implements RollingTransport {

    private static final Logger LOGGER = LogManager.getLogger(Truck.class);
    private static final int CRUISING_SPEED = 100;

    @Override
    public void deliver() {
        LOGGER.info("Delivering by truck...");
    }

    @Override
    public void roll() {
        LOGGER.info("The truck [{}] is rolling.", this);
    }

    @Override
    public void accelerate() {

        for (int currentSpeed = 0; currentSpeed < CRUISING_SPEED; currentSpeed += 50) {
            LOGGER.info("The car is accelerating. The CRUISING_SPEED is {} km/h...", currentSpeed);
        }

    }

    @Override
    public void brake() {

        for (int currentSpeed = CRUISING_SPEED; currentSpeed > 0; currentSpeed -= 50) {
            LOGGER.info("The car is breaking. The CRUISING_SPEED is {} km/h...", currentSpeed);
        }
    }

}
