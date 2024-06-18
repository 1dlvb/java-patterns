package ru.patterns.facade;

/**
 * Facade for cars. Hides all inner logic and gives user only two methods: {@link #startCar()} and {@link #stopCar()}.
 * @author Matushkin Anton
 */
public class Car {

    private static final Headlights HEADLIGHTS = new Headlights();
    private static final Engine ENGINE = new Engine();
    private static final FuelPump FUEL_PUMP = new FuelPump();

    /**
     * Method preparing car before ride.
     */
    public void startCar() {
        HEADLIGHTS.onStart();
        FUEL_PUMP.onStart();
        ENGINE.onStart();
    }

    /**
     * Method turning off all car systems to freely leave the car.
     */
    public void stopCar() {
        HEADLIGHTS.onStop();
        FUEL_PUMP.onStop();
        ENGINE.onStop();
    }

}
