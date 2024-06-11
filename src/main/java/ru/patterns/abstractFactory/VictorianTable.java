package ru.patterns.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.patterns.factory.Plane;

/**
 * Implementation of a table interface for a Victorian bundle
 * @author Matushkin Anton
 */
public class VictorianTable implements Table {

    private static final Logger LOGGER = LogManager.getLogger(Plane.class);

    @Override
    public Integer legsCount() {
        return 1;
    }

    @Override
    public void sitAt() {
        LOGGER.info("You sat down at the Victorian table...");
    }

}
