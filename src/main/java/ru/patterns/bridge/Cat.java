package ru.patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Cat class extends the Animal class and represents a cat with a specific self-defense strategy.
 * @author Matushkin Anton
 */
public class Cat extends Animal {

    private static final Logger LOGGER = LogManager.getLogger(Cat.class);

    public Cat(SelfDefence selfDefenceStrategy) {
        super(selfDefenceStrategy);
    }

    /**
     * Implementation of the protectItself method for the Cat class.
     * Logs the action of the cat meowing and executes the attack and run parts of strategy.
     */
    @Override
    public void protectItself() {
        LOGGER.info("The cat is meowing...");
        selfDefenceStrategy.attack();
        selfDefenceStrategy.run();
    }

}
