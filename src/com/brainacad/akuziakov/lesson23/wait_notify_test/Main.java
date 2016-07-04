package com.brainacad.akuziakov.lesson23.wait_notify_test;

public class Main {

    public static void main(String[] args) {

        MyTestData data=new MyTestData();//(data);
        DataSender[] senders={
                new DataSender(data, "user1"),
                new DataSender(data, "user2"),
                new DataSender(data, "user3")
        };

        for(DataSender sender:senders){
            sender.start();
        }

        DataGenerator pr=new DataGenerator(data);
        pr.start();
    }
}
