package com.brainacad.agudyma.testGenerics.testgenerics1;

/**
 * Created by User on 06.06.2016.
 */
public class MyTuple <A,B,C>  {
    private A a;
    private B b;
    private C c;

    public MyTuple (A a, B b, C c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public A getA() {
        return a;
    }

    public B getB(){
        return b;
    }

    public  C getC(){
        return c;
    }
    @Override
    public String toString(){
        return getA() +" " + getB()+" "+getC();

    }
}

