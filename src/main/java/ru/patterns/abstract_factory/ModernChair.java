package ru.patterns.abstract_factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of a chair interface for a modern bundle
 * @author Matushkin Anton
 */
public class ModernChair implements Chair {

    private static final Logger LOGGER = LogManager.getLogger(ModernChair.class);

    @Override
    public Integer legsCount() {
        return 3;
    }

    @Override
    public void sitOn() {
        LOGGER.info("You sat down on the Modern chair...");
    }

}
