package ru.patterns.adapter;

/**
 * Adapter class converts european plug connector to american plug connector
 * @author Matushkin Anton
 */
public class EuropeanPlugConnectorToAmericanPlugConnectorAdapter extends AmericanPlugConnector
        implements EuropeanPlugConnector {

    /**
     * Supplies electricity by invoking the provideElectricity method of the American plug connector.
     */
    @Override
    public void supplyElectricity() {
        provideElectricity();
    }

}
