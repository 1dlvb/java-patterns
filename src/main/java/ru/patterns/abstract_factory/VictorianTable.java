package ru.patterns.abstract_factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of a table interface for a Victorian bundle
 * @author Matushkin Anton
 */
public class VictorianTable implements Table {

    private static final Logger LOGGER = LogManager.getLogger(VictorianTable.class);

    @Override
    public Integer legsCount() {
        return 1;
    }

    @Override
    public void sitAt() {
        LOGGER.info("You sat down at the Victorian table...");
    }

}
