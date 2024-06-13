package ru.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of FlyingTransport interface for planes.
 * @author Matushkin Anton
 */
public class Plane implements FlyingTransport {

    private static final Logger LOGGER = LogManager.getLogger(Plane.class);
    private static final int CRUISING_SPEED = 300;
    @Override
    public void deliver() {
        LOGGER.info("delivering by plane...");
    }

    @Override
    public void takeOff() {
        for (int currentSpeed = 0; currentSpeed < CRUISING_SPEED; currentSpeed += 100) {
            LOGGER.info("Acceleration on takeoff. Speed is {} km/h...", currentSpeed);
        }
        LOGGER.info("The plane took off successfully.");
    }

    @Override
    public void fly() {
        LOGGER.info("The plane[{}] is flying.", this);
    }

    @Override
    public void land() {
        for (int currentSpeed = CRUISING_SPEED; currentSpeed > 0; currentSpeed -= 100) {
            LOGGER.info("Slowing down on landing... Speed is {} km/h...\n", currentSpeed);
        }
        LOGGER.info("The plane landed successfully.");
    }

}
