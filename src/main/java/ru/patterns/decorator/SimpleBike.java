package ru.patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of Motorbike interface as simple bike.
 * The bike accelerates to the max speed.
 * @author Matushkin Anton
 */
public class SimpleBike implements Motorbike {

    private static final Logger LOGGER = LogManager.getLogger(SimpleBike.class);

    /**
     * The const responsible for how fast bike is accelerating.
     */
    private static final int ACCELERATION_RATE = 20;
    private static final int MAX_SPEED = 120;
    private int speed;

    @Override
    public Integer getSpeed() {
        accelerate();
        LOGGER.info("Current speed is {}km/h", speed);
        return speed;
    }

    /**
     * Handles acceleration. The speed increases by {@link #ACCELERATION_RATE}.
     */
    private void accelerate() {

        for (speed = 0; speed < MAX_SPEED; speed += ACCELERATION_RATE) {
            LOGGER.info("Speed is {}km/h", speed);
        }

    }

}
