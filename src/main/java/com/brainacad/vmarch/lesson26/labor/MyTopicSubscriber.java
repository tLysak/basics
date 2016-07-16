package com.brainacad.vmarch.lesson26.labor;


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

