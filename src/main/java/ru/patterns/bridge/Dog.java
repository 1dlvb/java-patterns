package ru.patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Dog class extends the Animal class and represents a cat with a specific self-defense strategy.
 * @author Matushkin Anton
 */
public class Dog extends Animal {

    private static final Logger LOGGER = LogManager.getLogger(Dog.class);

    public Dog(SelfDefence selfDefenceStrategy) {
        super(selfDefenceStrategy);
    }

    /**
     * Implementation of the protectItself method for the Dog class.
     * Logs the action of the dog barking and executes the attack and run parts of strategy.
     */
    @Override
    public void protectItself() {
        LOGGER.info("The dog is barking...");
        selfDefenceStrategy.attack();
        selfDefenceStrategy.run();
    }

}
