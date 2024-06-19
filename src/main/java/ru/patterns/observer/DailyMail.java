package ru.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link Newsletter} interface for DailyMail news.
 * @author Matushkin Anton
 */
public class DailyMail implements Newsletter {

    private final List<Subscriber> subscribers;
    private final String news;

    public DailyMail(String news) {
        subscribers = new ArrayList<>();
        this.news = news;
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public String getNews() {
        return news;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

}
