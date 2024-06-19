package ru.patterns.observer;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsletterTests {
    private static LogCaptor subscriberLogCaptor;

    @BeforeAll
    public static void setupLogCaptor() {
        subscriberLogCaptor = LogCaptor.forClass(Subscriber.class);
    }

    @AfterEach
    public void clearLogs() {
        subscriberLogCaptor.clearLogs();
    }

    @Test
    void testDailyMailAddsANewSubscriber(){
        String subscriberName = "Anton";
        String news = "Breaking news!";

        DailyMail dailyMail = new DailyMail(news);
        Subscriber subscriber = new Subscriber(subscriberName);
        dailyMail.registerSubscriber(subscriber);
        List<Subscriber> subscribers = dailyMail.getSubscribers();
        assertEquals(subscribers.get(subscribers.size() - 1), subscriber);
    }

    @Test
    void testDailyMailRemovesSubscriber(){
        String subscriberName = "Anton";
        String news = "Breaking news!";

        DailyMail dailyMail = new DailyMail(news);
        Subscriber subscriber = new Subscriber(subscriberName);
        dailyMail.registerSubscriber(subscriber);
        List<Subscriber> subscribers = dailyMail.getSubscribers();

        assertEquals(subscriber, subscribers.get(subscribers.size() - 1));

        dailyMail.removeSubscriber(subscriber);
        subscribers = dailyMail.getSubscribers();

        assertEquals(0, subscribers.size());
    }

    @Test
    void testSubscriberGetsMessageFromDailyMailNewsletter(){
        String subscriberName = "Anton";
        String news = "Breaking news!";

        DailyMail dailyMail = new DailyMail(news);
        Subscriber subscriber = new Subscriber(subscriberName);
        dailyMail.registerSubscriber(subscriber);
        dailyMail.notifySubscribers();

        assertTrue(subscriberLogCaptor.getInfoLogs().contains(String.format("Subscriber %s got this message: %s ",
                subscriberName, news)));
    }
}