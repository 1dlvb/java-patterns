package ru.patterns.mediator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class for runways. Handle runway functionality.
 * @author Matushkin Anton
 */
public class Runway implements Command {

    private static final Logger LOGGER = LogManager.getLogger(Runway.class);
    private final AirTrafficController trafficController;
    Runway(AirTrafficController trafficController) {
        this.trafficController = trafficController;
    }

    /**
     * Reports to a flight on availability of a runway
     */
    @Override
    public void land() {
        LOGGER.info("Runway is available for landing.");
        trafficController.setAvailabilityStatus(true);
    }

}
