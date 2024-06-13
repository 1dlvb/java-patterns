package ru.patterns.abstract_factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of a chair interface for a Victorian bundle
 * @author Matushkin Anton
 */
public class VictorianChair implements Chair {

    private static final Logger LOGGER = LogManager.getLogger(VictorianChair.class);

    @Override
    public Integer legsCount() {
        return 4;
    }

    @Override
    public void sitOn() {
        LOGGER.info("You sat down on the Victorian chair...");
    }

}
