package ru.patterns.abstract_factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.patterns.factory.Plane;

/**
 * Implementation of a table interface for a modern bundle
 * @author Matushkin Anton
 */
public class ModernTable implements Table {

    private static final Logger LOGGER = LogManager.getLogger(Plane.class);

    @Override
    public Integer legsCount() {
        return 4;
    }

    @Override
    public void sitAt() {
        LOGGER.info("You sat down at the Modern table...");
    }

}
