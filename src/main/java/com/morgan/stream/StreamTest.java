package com.morgan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: Java 8 Stream测试
 * @Author: Morgan
 * @Date: 2020/4/26 14:54
 **/
public class StreamTest {

    private static boolean flag;

    public static void main(String[] args) {
        String[] nameas = {"Morgan","Tom","Lance","Meng","Null","Rush","Bing"};
        Stream<String> stream = Arrays.stream(nameas);
        System.out.println(flag);
        /**
         * Stream常见用法
         * 1：filter(过滤)
         * 2：试验Stream的惰性化(只在最终操作中才对流的每个元素进行相应函数的执行)
         * 3: findFirst
         * 4：reduce:组合操作
         */
        // 转换大小写
//        List<String> v1 =  stream.map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(v1);
        // 1：filter(过滤)
//        stream.filter(s -> s.startsWith("L")).collect(Collectors.toList()).forEach(System.out::println);
        // 2：试验Stream的惰性化
//        List<String> v2 =  Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());
//        System.out.println(v2);
        // 3: findFirst
//        Optional<String> first = stream.findFirst();
        // 4：reduce
//        System.out.println(stream.reduce("",String::concat));
    }
}
