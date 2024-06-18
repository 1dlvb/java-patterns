package ru.patterns.mediator;

/**
 * Implementation of an {@link AirTrafficController} for some specific airport.
 * @author Matushkin Anton
 */
public class AirTrafficControllerImpl implements AirTrafficController {

    private Flight flight;
    private Runway runway;
    private Boolean isAvailable;

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setAvailabilityStatus(Boolean status) {
        this.isAvailable = status;
    }

    @Override
    public Boolean isAvailable() {
        return isAvailable;
    }

    public Flight getFlight() {
        return flight;
    }

    public Runway getRunway() {
        return runway;
    }

}
