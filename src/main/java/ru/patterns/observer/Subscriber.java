package ru.patterns.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

/**
 * The Subscriber class represents an observer in the Observer pattern.
 * It reacts to notifications coming from the object it observes.
 * @author Matushkin Anton
 */
public class Subscriber {

    private static final Logger LOGGER = LogManager.getLogger(Subscriber.class);
    private final String name;

    /**
     * @param name The name of the subscriber.
     */
    public Subscriber(String name) {
        this.name = name;
    }

    /**
     * The update method is called when the subscriber receives news.
     * It logs the information that the subscriber has received a message.
     *
     * @param news The news received by the subscriber.
     */
    public void update(String news) {
        LOGGER.info("Subscriber {} got this message: {} ", name, news);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
