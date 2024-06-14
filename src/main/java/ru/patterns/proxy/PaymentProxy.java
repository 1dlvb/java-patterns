package ru.patterns.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class serves as a protective layer.
 * It checks user credentials before processing payment.
 * @author Mathushkin Anton
 */
public class PaymentProxy implements Payment {

    private Payment payment;
    private final PaymentType paymentType;
    private static final Logger LOGGER = LogManager.getLogger(PaymentProxy.class);

    public PaymentProxy(PaymentType paymentType) {

        this.paymentType = paymentType;

    }

    /**
     * Method checking user credentials.
     * Should be used before process payment.
     */
    private void checkCredentials() {

        LOGGER.info("Access is allowed.");

    }

    @Override
    public Boolean pay() {
        LOGGER.info("Payment requested by {}", paymentType);
        checkCredentials();
        if (payment == null) {
            switch (paymentType) {
                case CASH -> payment = new CashPayment();
                case CARD -> payment = new CardPayment();
                default -> {
                    LOGGER.error("Undefined type of payment");
                    throw new IllegalArgumentException("Undefined type of payment.");
                }
            }
        }
        payment.pay();
        LOGGER.info("Payment was made by {}", paymentType);
        return true;
    }

}
