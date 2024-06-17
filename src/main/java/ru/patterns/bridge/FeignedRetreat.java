package ru.patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of SelfDefence as feigned retreat strategies.
 * The main idea of the strategy is to pretend to flee to lure the enemy into a trap.
 * @author Matushkin Anton
 */
public class FeignedRetreat implements SelfDefence {

    private final Logger logger;

    /**
     * @param invokedFrom is class from which the constructor was called.
     */
    public FeignedRetreat(final Class<?> invokedFrom) {
        logger = LogManager.getLogger(invokedFrom);
    }

    @Override
    public void attack() {
        logger.info("Attacking...");
    }

    @Override
    public void run() {
        logger.info("Pretending to flee...");
    }

}
