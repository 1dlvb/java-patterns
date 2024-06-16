package ru.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Handling cars headlights.
 * @author Matushkin Anton
 */
public class Headlights implements CarParts {

    private static final Logger LOGGER = LogManager.getLogger(Headlights.class);

    @Override
    public void onStart() {
        LOGGER.info("Headlights is on.");
    }

    @Override
    public void onStop() {
        LOGGER.info("Headlights is off.");
    }

}
