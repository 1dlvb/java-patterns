package ru.patterns.abstractFactory;

/**
 * An interface serving chairs for the furniture bundle
 * @author Matushkin Anton
 */
public interface Chair {

    /**
     * @return amount of legs
     */
    Integer legsCount();

    /**
     * method to processing of sitting on
     */
    void sitOn();

}
