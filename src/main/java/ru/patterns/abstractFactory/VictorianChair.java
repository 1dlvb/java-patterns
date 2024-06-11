package ru.patterns.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.patterns.factory.Plane;

/**
 * Implementation of a chair interface for a Victorian bundle
 * @author Matushkin Anton
 */
public class VictorianChair implements Chair {

    private static final Logger LOGGER = LogManager.getLogger(Plane.class);

    @Override
    public Integer legsCount() {
        return 4;
    }

    @Override
    public void sitOn() {
        LOGGER.info("You sat down on the Victorian chair...");
    }

}
