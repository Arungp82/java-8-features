package com.module1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsAgency implements NewsAgency {
    private List<NewsSubscriber> subscriberList = new ArrayList<>();

    @Override
    public void registerSubscriber(NewsSubscriber subscriber) {
        subscriberList.add(subscriber);
    }


    @Override
    public void removeSubscriber(NewsSubscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void publishNews(String news) {
        for (NewsSubscriber subscriber : subscriberList) {
            subscriber.update(news);
        }
    }
}
