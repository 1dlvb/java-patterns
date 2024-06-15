package ru.patterns.bridge;

/**
 * This class serves as the base for all animals that have the capability to defend themselves.
 * @author Matushkin Anton
 */
public abstract class Animal {

    protected SelfDefence selfDefenceStrategy;

    /**
     * Constructor for creating an instance of an animal with a specified self-defense strategy.
     *
     * @param selfDefenceStrategy the self-defense strategy that the animal will use
     */
    public Animal(SelfDefence selfDefenceStrategy) {
        this.selfDefenceStrategy = selfDefenceStrategy;
    }

    /**
     * The specific implementation of this method must be provided in subclasses,
     * describing the behavior of the animal when defending itself.
     */
    public abstract void protectItself();

}
