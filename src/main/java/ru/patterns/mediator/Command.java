package ru.patterns.mediator;

/**
 * Interface handles commands from the ATC ({@link AirTrafficController}) to a {@link Flight}.
 * @author Matushkin Anton
 */
public interface Command {

    void land();

}
