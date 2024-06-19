package ru.patterns.observer;

/**
 * The Newsletter interface defines the operations for managing subscribers
 * in the Observer pattern. It allows for the registration, removal, and notification
 * of subscribers.
 * @author Matushkin Anton
 */
public interface Newsletter {

    /**
     * Notifies all registered subscribers of a news update.
     */
    void registerSubscriber(Subscriber subscriber);

    /**
     * Removes an existing subscriber from the notification list.
     *
     * @param subscriber The subscriber to be removed.
     */
    void removeSubscriber(Subscriber subscriber);

    /**
     * Notifies all registered subscribers of a news update.
     */
    void notifySubscribers();

}
