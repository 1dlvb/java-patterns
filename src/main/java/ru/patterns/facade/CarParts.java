package ru.patterns.facade;

/**
 * Interface for car parts that must be turned on before start and turned off after stop.
 * @author Matushkin Anton
 */
interface CarParts {

    /**
     * Should be used to prepare car part before ride.
     */
    void onStart();

    /**
     * Should be used to turn off car part after ride.
     */
    void onStop();

}
