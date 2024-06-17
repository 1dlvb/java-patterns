package ru.patterns.mediator;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AirTrafficControllerTests {
    private static LogCaptor flightLogCaptor;
    private static LogCaptor runwayLogCaptor;

    private static final String FLIGHT_IS_READY_TO_LAND_MESSAGE = "Landing initiated.";
    private static final String FLIGHT_IS_PARKED_MESSAGE = "Flight is parked.";
    private static final String FLIGHT_LAND_WHEN_RUNWAY_IS_AVAILABLE_MESSAGE = "Landed successfully.";
    private static final String FLIGHT_LAND_WHEN_RUNWAY_IS_NOT_AVAILABLE_MESSAGE = "Waiting for runway.";

    private static final String RUNWAY_LAND_MESSAGE = "Runway is available for landing.";

    @BeforeAll
    public static void setupLogCaptor() {
        flightLogCaptor = LogCaptor.forClass(Flight.class);
        runwayLogCaptor = LogCaptor.forClass(Runway.class);
    }

    @AfterEach
    public void clearLogs() {
        flightLogCaptor.clearLogs();
        runwayLogCaptor.clearLogs();
    }
    @Test
    void testFlightIsReadyToLand() {
        AirTrafficController trafficController = new AirTrafficControllerImpl();
        Flight flight = new Flight(trafficController);
        flight.readyToLand();
        assertTrue(flightLogCaptor.getInfoLogs().contains(FLIGHT_IS_READY_TO_LAND_MESSAGE));
    }
    @Test
    void testFlightLandWhenRunwayIsAvailable() {
        AirTrafficController trafficController = new AirTrafficControllerImpl();
        Flight flight = new Flight(trafficController);
        Runway runway = new Runway(trafficController);
        flight.readyToLand();
        runway.land();
        flight.land();
        assertTrue(runwayLogCaptor.getInfoLogs().contains(RUNWAY_LAND_MESSAGE));
        assertTrue(flightLogCaptor.getInfoLogs().contains(FLIGHT_LAND_WHEN_RUNWAY_IS_AVAILABLE_MESSAGE));
    }

    @Test
    void testFlightIsParkedSuccessfully() {
        AirTrafficController trafficController = new AirTrafficControllerImpl();
        Flight flight = new Flight(trafficController);
        flight.parked();
        assertTrue(flightLogCaptor.getInfoLogs().contains(FLIGHT_IS_PARKED_MESSAGE));
    }
    @Test
    void testFlightLandWhenRunwayIsNotAvailable() {
        AirTrafficController trafficController = new AirTrafficControllerImpl();
        Runway runway = new Runway(trafficController);
        Flight flight1 = new Flight(trafficController);
        Flight flight2 = new Flight(trafficController);

        flight1.readyToLand();
        runway.land();

        flight1.land();
        flight2.land();

        flight1.parked();
        flight2.land();

        assertTrue(runwayLogCaptor.getInfoLogs().contains(RUNWAY_LAND_MESSAGE));
        assertTrue(flightLogCaptor.getInfoLogs().contains(FLIGHT_LAND_WHEN_RUNWAY_IS_AVAILABLE_MESSAGE));
        assertTrue(flightLogCaptor.getInfoLogs().contains(FLIGHT_LAND_WHEN_RUNWAY_IS_NOT_AVAILABLE_MESSAGE));
    }
}
