package com.module1;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();

        NewsSubscriber subscriber1 = new ConcreteNewsSubscriber("Subscriber A");
        NewsSubscriber subscriber2 = new ConcreteNewsSubscriber("Subscriber B");

        newsAgency.registerSubscriber(subscriber1);
        newsAgency.registerSubscriber(subscriber2);

        newsAgency.publishNews("Breaking: New Software Released!");

        newsAgency.removeSubscriber(subscriber1);

        newsAgency.publishNews("Important: Market Trends Update!");
    }
}
