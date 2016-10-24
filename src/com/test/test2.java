package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by wangtao on 10/24/16.
 */
public class test2 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("1one", "two", "three", "4four");
        for(String str : strList){
            if(Character.isDigit(str.charAt(0))){
                System.out.println(str);
            }
        }

        strList.stream()// 1.得到容器的Steam
                .filter(str -> Character.isDigit(str.charAt(0)))// 2.选出以数字开头的字符串
                .forEach(str -> System.out.println(str));// 3.输出字符串

        /*
            上述代码首先
            1. 调用List.stream()方法得到容器的Stream，
            2. 然后调用filter()方法选出不以数字开头的字符串，
            3. 之后调用map()方法将字符串转换成大写形式，
            4. 最后调用collect()方法将结果转换成Set。
            这个例子还向我们展示了方法引用（method references，代码中标号3处）以及收集器（Collector，代码中标号4处）的用法，这里不再展开说明。
        * */
        List<String> testList = Arrays.asList("1owne", "twown", "three", "4fownur");
        Set<String> newList =
                testList.stream()// 1.得到容器的Stream
                        .filter(str -> str.contains("own"))// 2.选出不以数字开头的字符串
                        .map(String::toUpperCase)// 3.转换成大写形式
                        .collect(Collectors.toSet());// 4.生成结果集

        newList.stream().forEach(str -> System.out.println(str));//5.输入结果
    }
}
