package com.brainacad.agudyma.javaSE.TestGC;

import com.brainacad.skozigon.Labs.labs3_16.testreflection1.MyClass;

/**
 * Created by User on 7/29/2016.
 */
public class TestGS {

    static class MyObj{
        long someInfo;
        public MyObj(long someInfo){
            this.someInfo = someInfo;
        }

        @Override
        public String toString(){
            return "MyObj, value:" + someInfo;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("method invoked");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyObj objRef = new MyObj(123456);
        objRef = null;
        System.out.println("Test 1, Set objRef to " + objRef);
        System.gc();
        Thread.sleep(5000);
        System.out.println("objref= " + objRef);

    }


}
