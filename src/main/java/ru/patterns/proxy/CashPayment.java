package ru.patterns.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of the payment interface for handling payments by cash.
 * @author Matushkin Anton
 */
public class CashPayment implements Payment {

    private static final Logger LOGGER = LogManager.getLogger(CashPayment.class);

    @Override
    public Boolean pay() {
        LOGGER.info("The cash payment was successful.");
        return true;
    }

}
