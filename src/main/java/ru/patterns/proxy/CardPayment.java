package ru.patterns.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of the payment interface for handling payments by card.
 * @author Matushkin Anton
 */
public class CardPayment implements Payment {

    private static final Logger LOGGER = LogManager.getLogger(CashPayment.class);

    @Override
    public Boolean pay() {
        LOGGER.info("The card payment was successful.");
        return true;
    }

}
