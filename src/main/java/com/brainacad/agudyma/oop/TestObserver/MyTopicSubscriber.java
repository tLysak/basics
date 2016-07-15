package com.brainacad.agudyma.oop.TestObserver;


/**
 * Created by User on 11/07/2016.
 */
public class MyTopicSubscriber implements Observer {
    private String name;
    public MyTopicSubscriber(String nm){
        this.name = nm;
    }
    @Override
    public void update (String msg){
        System.out.println(name+": Consum. msg:"+msg);
    }


}
