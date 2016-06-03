package com.brainacad.skozigon.Labs.labs2_12_5;

/**
 * Created by skozigon on 03.06.2016.
 */
public class MyTestClass {
    public char myTestClassChar = 'c';

    void test() {
        System.out.println("Method test in class MyTest " + myTestClassChar);
    }

    static class MyStaticNested extends MyTestClass{

        private double myStaticNestedDouble = 128d;

        public void staticNestedMethod() {
            System.out.println("Method in class MyStaticNested " + myStaticNestedDouble);
        }
    }

    class MyInner {
        final int j = 15;
        void myLocalMethod() {

            class MyLocal1 {
                private int i = 10;
            }
            System.out.println("myLocalMethod " + new MyLocal1().i);
        }
        void myNextLocalMethod() {
            class MyLocal2{
                MyLocal2(){
                    System.out.println("Accesses MyInner class member from MyLocal class: " + j);
                }
            }
                new MyLocal2();
        }

    }

}





