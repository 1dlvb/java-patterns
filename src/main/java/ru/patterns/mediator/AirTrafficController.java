package ru.patterns.mediator;

/**
 * Air traffic controller interface for handle air traffic of an airport.
 * @author Matushkin Anton
 */
public interface AirTrafficController {

    /**
     * Registers a flight
     * @param flight a flight contacting the dispatcher.
     */
    void registerFlight(Flight flight);

    /**
     * Registers a runway
     * @param runway a runway that flight wants to land on.
     */
    void registerRunway(Runway runway);

    /**
     * @param status true if runway in case if available, false if not.
     */
    void setAvailabilityStatus(Boolean status);

    /**
     * @return availability status.
     */
    Boolean isAvailable();

}
