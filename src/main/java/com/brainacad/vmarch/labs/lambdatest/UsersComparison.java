package com.brainacad.vmarch.labs.lambdatest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsersComparison {


    public static void main(String[] args) {
        List<UserObject> list = new ArrayList<>();

        UserObject u1 = new UserObject(56);
        UserObject u2 = new UserObject(42);
        UserObject u3 = new UserObject(81);
        UserObject u4 = new UserObject(10);
        UserObject u5 = new UserObject(9);

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        Collections.sort(list, (UserObject user1, UserObject user2) -> user1.getAge() - user2.getAge());

        System.out.println(list);

    }

}
