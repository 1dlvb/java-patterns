package ru.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class handling cars fuel pumps.
 * @author Matushkin Anton
 */
public class FuelPump implements CarParts {

    private static final Logger LOGGER = LogManager.getLogger(FuelPump.class);

    @Override
    public void onStart() {
        LOGGER.info("Fuel pump is pumping.");
    }

    @Override
    public void onStop() {
        LOGGER.info("Fuel pump is stopped.");
    }

}
