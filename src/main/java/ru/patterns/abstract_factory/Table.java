package ru.patterns.abstract_factory;

/**
 * An interface serving tables for the furniture bundle
 * @author Matushkin Anton
 */
public interface Table {

    /**
     * @return amount of legs of a table
     */
    Integer legsCount();

    /**
     * A method for processing sitting at
     */
    void sitAt();

}
