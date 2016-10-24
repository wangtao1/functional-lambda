package com.test;

import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.BinaryOperator;

/**
 * Created by wangtao on 10/24/16.
 */
public class Test1 {

    public static void main(String[] args) {
        new Thread(
                () -> System.out.println("Thread first run()")
        ).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread second run test");
            }
        }).start();


        //可以放多行代码 以 大括号扩起
        new Thread(
                () -> {
                    System.out.println("Thread test111");
                    System.out.println("Thread test222");
                }
        ).start();


        /*
            Lambda表达式是有类型的，赋值操作的左边就是类型。Lambda表达式的类型实际上是对应接口的类型。
            Lambda表达式可以包含多行代码，需要用大括号把代码块括起来，就像写函数体那样。
            大多数时候，Lambda表达式的参数表可以省略类型，就像代码2和5那样。这得益于javac的类型推导机制，编译器可以根据上下文推导出类型信息。
        */
        Runnable run = () -> System.out.println("Hello World");
        ActionListener listener = event -> System.out.println("test clicked");// 2
        Runnable multiLine = () -> {// 3
            System.out.println("Hi ");
            System.out.println("boy");
        };
        BinaryOperator<Long> add = (Long x, Long y) -> x + y;// 4
        BinaryOperator<Long> addImplicit = (x, y) -> x + y;// 5
    }


}
