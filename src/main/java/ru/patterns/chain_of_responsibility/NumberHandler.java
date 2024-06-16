package ru.patterns.chain_of_responsibility;

/**
 * Basic handler for numbers. If the handler cannot handle the request,
 * it passes the request to the next handler and so on down the chain.
 * @author Matushkin Anton
 */
public abstract class NumberHandler {

    protected NumberHandler nextHandler;

    /**
     * @param nextHandler handler that will be further down the chain from current handler.
     */
    public void setNextHandler(NumberHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleNumberRequest(int numberRequest);

}

