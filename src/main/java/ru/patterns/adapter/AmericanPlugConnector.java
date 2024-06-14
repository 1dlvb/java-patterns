package ru.patterns.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class representing an American plug connector.
 * @author Matushkin Anton
 */
public class AmericanPlugConnector {

    private static final Logger LOGGER = LogManager.getLogger(AmericanPlugConnector.class);

    public void provideElectricity() {
        LOGGER.info("Electricity is providing by american plug.");
    }

}
