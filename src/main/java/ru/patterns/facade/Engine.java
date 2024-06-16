package ru.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class handling cars engines.
 * @author Matushkin Anton
 */
public class Engine implements CarParts {

    private static final Logger LOGGER = LogManager.getLogger(Engine.class);

    @Override
    public void onStart() {
        LOGGER.info("Engine is started.");
    }

    @Override
    public void onStop() {
        LOGGER.info("Engine is stopped.");
    }

}
