package com.brainacad.agudyma.javaSE.testLambda;

import java.util.*;
import java.util.List;

/**
 * Created by User on 8/1/2016.
 */
public class TestLambda {
    static class  UserObject {
        int age;
        String name;

        public UserObject(int i, String name) {
            this.age = i;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString(){

            return  name+ " "+String.valueOf(age)  ;
        }
    }

    public static void main(String[] args) {
        List<String> coll = new ArrayList<String>() ;
        Collections.addAll(coll,"www","aaa","sss","dddd","tttt");
        Collections.sort(coll);

        List<UserObject> userObjects = new ArrayList<UserObject>();

        userObjects.add( new UserObject(51,"Moses"));
        userObjects.add( new UserObject(24,"David"));
        userObjects.add( new UserObject(12,"Isaac"));
        userObjects.add( new UserObject(17,"Solomon" ));
        userObjects.add( new UserObject(31,"Benjamin" ));
        userObjects.add( new UserObject(24,"Jacob"));

        System.out.println(userObjects);

        Collections.sort(userObjects, (UserObject object1, UserObject object2)->
        object1.getAge()-object2.getAge());

        System.out.println(userObjects);
//
        Collections.sort(userObjects, (UserObject object1, UserObject object2)->
                object1.getName().compareTo(object2.getName()));

        System.out.println(userObjects);
        userObjects.forEach(System.out::println);
        }
    }

