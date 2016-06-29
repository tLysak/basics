package com.brainacad.onesterenko.lesson20.synchron2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by User on 24.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTestData data = new MyTestData();
        DataSender[] senders = {
                new DataSender(data,"user1"),
                new DataSender(data,"user2"),
                new DataSender (data,"user3"),
        };
        for (DataSender sender:senders)
            sender.start();
        DataGenerator pr = new DataGenerator(data);
        pr.start();
    }
}
