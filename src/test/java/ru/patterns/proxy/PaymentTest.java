package ru.patterns.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PaymentTest {

    @Test
    void isCashPaymentIsProcessing() {
        Payment cashPayment = new PaymentProxy(PaymentType.CASH);
        Assertions.assertTrue(cashPayment.pay());
    }

    @Test
    void isCardPaymentIsProcessing() {
        Payment cashPayment = new PaymentProxy(PaymentType.CASH);
        Assertions.assertTrue(cashPayment.pay());
    }
}