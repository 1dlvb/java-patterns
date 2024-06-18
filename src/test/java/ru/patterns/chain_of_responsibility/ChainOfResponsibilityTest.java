package ru.patterns.chain_of_responsibility;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ChainOfResponsibilityTest {

    @Test
    void isNumberHandlersWorksInAChain() {
        LogCaptor negativeNumberHandlerLogCaptor = LogCaptor.forClass(NegativeNumberHandler.class);
        LogCaptor zeroNumberHandlerLogCaptor = LogCaptor.forClass(ZeroNumberHandler.class);
        LogCaptor positiveNumberHandlerLogCaptor = LogCaptor.forClass(PositiveNumberHandler.class);

        NumberHandler negativeNumberHandler = new NegativeNumberHandler();
        NumberHandler zeroNumberHandler = new ZeroNumberHandler();
        NumberHandler positiveNumberHandler = new PositiveNumberHandler();

        negativeNumberHandler.setNextHandler(zeroNumberHandler);
        zeroNumberHandler.setNextHandler(positiveNumberHandler);

        int[] requests = {0, 1, 2, -3, 0, 3, -1, 1};
        for (int request : requests) {
            negativeNumberHandler.handleNumberRequest(request);
        }
        assertEquals("NegativeNumberHandler handled the request. Number is -3",
                negativeNumberHandlerLogCaptor.getInfoLogs().get(0));
        assertEquals("NegativeNumberHandler handled the request. Number is -1",
                negativeNumberHandlerLogCaptor.getInfoLogs().get(1));
        assertEquals("ZeroNumberHandler handled the request. Number is 0",
                zeroNumberHandlerLogCaptor.getInfoLogs().get(0));
        assertEquals("ZeroNumberHandler handled the request. Number is 0",
                zeroNumberHandlerLogCaptor.getInfoLogs().get(1));
        assertEquals("PositiveNumberHandler handled the request. Number is 1",
                positiveNumberHandlerLogCaptor.getInfoLogs().get(0));
        assertEquals("PositiveNumberHandler handled the request. Number is 2",
                positiveNumberHandlerLogCaptor.getInfoLogs().get(1));
        assertEquals("PositiveNumberHandler handled the request. Number is 3",
                positiveNumberHandlerLogCaptor.getInfoLogs().get(2));
        assertEquals("PositiveNumberHandler handled the request. Number is 1",
                positiveNumberHandlerLogCaptor.getInfoLogs().get(3));
    }

}