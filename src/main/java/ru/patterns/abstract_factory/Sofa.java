package ru.patterns.abstract_factory;

/**
 * An interface serving sofas for the furniture bundle
 * @author Matushkin Anton
 */
public interface Sofa {

    /**
     * @return amount of legs of the sofa
     */
    Integer legsCount();

    /**
     * A method for processing sitting on
     */
    void sitOn();

    /**
     * A method for processing lying on
     */
    void lieOn();

}
