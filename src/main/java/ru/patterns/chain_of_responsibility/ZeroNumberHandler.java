package ru.patterns.chain_of_responsibility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * {@link NumberHandler} extension for zero
 * @author Matushkin Anton
 */
public class ZeroNumberHandler extends NumberHandler {

    private static final Logger LOGGER = LogManager.getLogger(ZeroNumberHandler.class);

    /**
     * If request is zero the handler handles it, in other cases handler passes the request further down the chain
     * @param numberRequest request that should be handled.
     */
    @Override
    public void handleNumberRequest(int numberRequest) {
        if (numberRequest == 0) {
            LOGGER.info("ZeroNumberHandler handled the request. Number is {}", numberRequest);
        } else if (nextHandler != null) {
            nextHandler.handleNumberRequest(numberRequest);
        }
    }

}
