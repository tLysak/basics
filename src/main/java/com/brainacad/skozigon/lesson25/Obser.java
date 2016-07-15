package com.brainacad.skozigon.lesson25;//package com.brainacad.skozigon.lesson25;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
///**
// * Created by skozigon on 11.07.2016.
// */
//public class Obser {
//    public static void main(String[] args) {
//        MyTopic topic = new MyTopic();
//        //create observers
//        Observer obj1 = new MyTopicSubscriber("Obj1");
//        Observer obj2 = new MyTopicSubscriber("Obj2");
//        Observer obj3 = new MyTopicSubscriber("Obj3");
//        //register observers to the subject
//        topic.register(obj1);
//        topic.register(obj2);
//        topic.register(obj3);
//
//        topic.postMessage("New Message");
//    }
//}
//
//interface Subject {
//    public void register(Observer obj);
//
//    public void unregister(Observer obj);
//
//    public void notifyObservers();
//}
//
//interface Observer {
//    public void update(String str);
//}
//
//class MyTopic implements Observer {
//    private List<Observer> observers;
//    private String message;
//
//    public MyTopic() {
//        this.observers = new ArrayList<>();
//    }
//
//    @Override
//    public void register(Observer obj) {
//        observers.add(obj);
//    }
//
//    @Override
//    public void unregister(Observer obj) {
//        observers.remove(obj);
//    }
//
//    @Override
//    public void notifyObservers(Observer obj) {
//        for (Observer obj : observers) {
//            obj.update(this.message);
//        }
//    }
//
//
//    public void postMessage(String msg){
//        System.out.println("Message Posted to Topic:" + msg);
//        this.message = msg;
//        notifyObservers();
//    }
//
//    public class MyTopicSubscriber implements Observer {
//        private String name;
//        public MyTopicSubscriber(String nm){
//            this.name = nm;
//        }
//        @Override
//        public void update (String msg){
//            System.out.println(name+": Consum. msg:"+msg);
//        }
//
//    }
//
//}