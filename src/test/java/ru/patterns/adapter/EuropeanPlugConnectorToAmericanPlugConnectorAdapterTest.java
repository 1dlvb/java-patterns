package ru.patterns.adapter;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuropeanPlugConnectorToAmericanPlugConnectorAdapterTest {

    @Test
    void supplyElectricity() {
        LogCaptor logCaptor = LogCaptor.forClass(AmericanPlugConnector.class);
        EuropeanPlugConnector connector = new EuropeanPlugConnectorToAmericanPlugConnectorAdapter();
        connector.supplyElectricity();
        assertEquals("Electricity is providing by american plug.", logCaptor.getInfoLogs().get(0) );
    }
}