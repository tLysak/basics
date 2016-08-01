package com.brainacad.agudyma.javaSE.testProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by User on 7/29/2016.
 */
public class TestProxy {
    public static void main(String[] args) {
        Calculator proxiedCalculator = (Calculator) Proxy.newProxyInstance(TestProxy.class.getClassLoader(),new Class[]{Calculator.class},  new MyHandler());




        System.out.println("Call methods using the proxy");
        proxiedCalculator.add(2,3);
        proxiedCalculator.mul(2,3);

    }

    private static class MyHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("the method<"+method.getName() + ">invoked with arg" + Arrays.toString(args));
            return 0;
        }
    }



}
