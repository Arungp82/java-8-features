package com.module1;

public interface NewsAgency {
    void registerSubscriber(NewsSubscriber subscriber);
    void removeSubscriber(NewsSubscriber subscriber);
    void publishNews(String news);
}
