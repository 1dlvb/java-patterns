package ru.patterns.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.patterns.factory.Plane;

/**
 * Implementation of a sofa interface for a modern bundle
 * @author Matushkin Anton
 */
public class ModernSofa implements Sofa {

    private static final Logger LOGGER = LogManager.getLogger(Plane.class);

    @Override
    public Integer legsCount() {
        return 8;
    }

    @Override
    public void sitOn() {
        LOGGER.info("You sat down on the Modern sofa...");
    }

    @Override
    public void lieOn() {
        LOGGER.info("You lay down on the Modern sofa...");
    }

}
