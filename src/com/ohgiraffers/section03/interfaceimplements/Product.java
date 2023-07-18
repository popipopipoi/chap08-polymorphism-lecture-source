package com.ohgiraffers.section03.interfaceimplements;

/* 인터페이스는 다중 상속이 가능하다. implements 뒤에 인터페이스를 나열하면 된다.
* 클래스 상속을 하면서 인터페이스 구현도 가능하다.
* extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다. */
public class Product extends Object implements InterProduct, java.io.Serializable{

    /* InterProduct의 추상 메소드는 반드시 구현해야 한다. (오버라이딩 강제화) */
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출...");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMothod 오버라이딩한 메소드 호출...");
    }
    /* static 메소드는 오버라이딩 할 수 없다. */
    // @Override
    // public static void staticMethod(){}

    /* default 메소드는 인터페이스 내에서만 작성 가능하다. */
//    @Override
//    public default void defaultMethod(){}

    /* default 키워드를 제외하면 오버라이딩 가능하다.
    * 오버라이딩이 강제화 되어 있지는 않다. */
    @Override
    public void defaultMethod(){
        System.out.println("Product 클래스의 defaultMethod 호출...");
    }

}
