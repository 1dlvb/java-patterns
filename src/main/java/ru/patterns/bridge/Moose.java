package ru.patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Moose class extends the Animal class and represents a cat with a specific self-defense strategy.
 * @author Matushkin Anton
 */
public class Moose extends Animal {

    private static final Logger LOGGER = LogManager.getLogger(Moose.class);

    public Moose(SelfDefence selfDefenceStrategy) {
        super(selfDefenceStrategy);
    }

    /**
     * Implementation of the protectItself method for the Moose class.
     * Logs the action of the moose yelling and executes the attack and run parts of strategy.
     */
    @Override
    public void protectItself() {
        LOGGER.info("The moose is yelling...");
        selfDefenceStrategy.attack();
        selfDefenceStrategy.run();
    }

}
