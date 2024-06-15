package ru.patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of SelfDefence as hit-and-run strategies.
 * This strategy involves launching a quick attack and then
 * withdrawing immediately before the enemy can mount a counterattack.
 * @author Matushkin Anton
 */
public class HitAndRun implements SelfDefence {

    private final Logger logger;

    /**
     * @param invokedFrom is class from which the constructor was called.
     */
    public HitAndRun(final Class<?> invokedFrom) {
        logger = LogManager.getLogger(invokedFrom);
    }

    @Override
    public void attack() {
        logger.info("Attacking...");
    }

    @Override
    public void run() {
        logger.info("Running...");
    }

}
