package com.module1;

public class ConcreteNewsSubscriber implements NewsSubscriber{

    private String name;

    public ConcreteNewsSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update(String news) {
        System.out.println(name + "  received news  "+news);
    }
}
