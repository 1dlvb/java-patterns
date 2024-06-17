package ru.patterns.mediator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class for flights. Handle flights functionality.
 * @author Matushkin Anton
 */
public class Flight implements Command {

    private static final Logger LOGGER = LogManager.getLogger(Flight.class);
    private final AirTrafficController trafficController;

    Flight(AirTrafficController trafficController) {
        this.trafficController = trafficController;
    }

    /**
     * If runway is available the flight lands, if not - the flight is wait.
     */
    @Override
    public void land() {
        if (trafficController.isAvailable()) {
            LOGGER.info("Landed successfully.");
            trafficController.setAvailabilityStatus(false);
        } else {
            LOGGER.info("Waiting for runway.");
        }
    }

    /**
     * Flight asks for landing.
     */
    public void readyToLand() {
        LOGGER.info("Landing initiated.");
    }

    /**
     * The flight reports on leaving the runway.
     */
    public void parked() {
        LOGGER.info("Flight is parked.");
        trafficController.setAvailabilityStatus(true);
    }

}
