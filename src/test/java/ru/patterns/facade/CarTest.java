package ru.patterns.facade;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private static LogCaptor headlightsLogCaptor;
    private static LogCaptor engineLogCaptor;
    private static LogCaptor fuelPumpLogCaptor;

    private static final String EXPECTED_INFO_HEADLIGHTS_ON_START_MESSAGE = "Headlights is on.";
    private static final String EXPECTED_INFO_ENGINE_ON_START_MESSAGE = "Engine is started.";
    private static final String EXPECTED_INFO_FUEL_PUMP_ON_START_MESSAGE = "Fuel pump is pumping.";

    private static final String EXPECTED_INFO_HEADLIGHTS_ON_STOP_MESSAGE = "Headlights is off.";
    private static final String EXPECTED_INFO_ENGINE_ON_STOP_MESSAGE = "Engine is stopped.";
    private static final String EXPECTED_INFO_FUEL_PUMP_ON_STOP_MESSAGE = "Fuel pump is stopped.";

    @BeforeAll
    static void setup(){
        headlightsLogCaptor = LogCaptor.forClass(Headlights.class);
        engineLogCaptor = LogCaptor.forClass(Engine.class);
        fuelPumpLogCaptor = LogCaptor.forClass(FuelPump.class);
    }

    @AfterEach
    void clearLogs(){
        headlightsLogCaptor.clearLogs();
        engineLogCaptor.clearLogs();
        fuelPumpLogCaptor.clearLogs();
    }

    @Test
    void isStartCarLogsHeadlightsEngineAndFuelPumpOnStartMethod() {
        Car car = new Car();
        car.startCar();
        assertTrue(headlightsLogCaptor.getInfoLogs().contains(EXPECTED_INFO_HEADLIGHTS_ON_START_MESSAGE),
                "Headlights isn't turned on.");
        assertTrue(fuelPumpLogCaptor.getInfoLogs().contains(EXPECTED_INFO_FUEL_PUMP_ON_START_MESSAGE),
                "Fuel pump isn't turned on.");
        assertTrue(engineLogCaptor.getInfoLogs().contains(EXPECTED_INFO_ENGINE_ON_START_MESSAGE),
                "Engine isn't turned on.");
    }

    @Test
    void isStartCarLogsHeadlightsEngineAndFuelPumpOnStopMethod() {
        Car car = new Car();
        car.stopCar();
        assertTrue(headlightsLogCaptor.getInfoLogs().contains(EXPECTED_INFO_HEADLIGHTS_ON_STOP_MESSAGE),
                "Headlights isn't turned off.");
        assertTrue(fuelPumpLogCaptor.getInfoLogs().contains(EXPECTED_INFO_FUEL_PUMP_ON_STOP_MESSAGE),
                "Fuel pump isn't turned off.");
        assertTrue(engineLogCaptor.getInfoLogs().contains(EXPECTED_INFO_ENGINE_ON_STOP_MESSAGE),
                "Engine isn't turned off.");
    }
}