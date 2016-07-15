package com.brainacad.onesterenko.lesson23.observer;

/**
 * Created by User on 11/07/2016.
 */
public class MyTopicSUbscriber implements Observer {
    private String name;
    public MyTopicSUbscriber(String nm){
        this.name = nm;
    }
    @Override
    public void update (String msg){
        System.out.println(name+": Consum. msg:"+msg);
    }

}
