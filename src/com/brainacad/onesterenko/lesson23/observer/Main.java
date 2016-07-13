package com.brainacad.onesterenko.lesson23.observer;

/**
 * Created by User on 11/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        Observer obj1 = new MyTopicSUbscriber("Obj1");
        Observer obj2 = new MyTopicSUbscriber("Obj2");
        Observer obj3 = new MyTopicSUbscriber("Obj3");
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        topic.postMessage("New Message");
    }
}
