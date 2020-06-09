package com.morgan.string;

public class WhyStringImutableTest {
    public static void main(String[] args) {
        WhyStringImutable whyStringImutable = new WhyStringImutableChild("abcd");
        System.out.println("原str中value数组的内容为：");
        System.out.println(whyStringImutable.getValue());
        System.out.println("----------");
//        whyStringImutable.value[1] = 's';
        System.out.println("修改后str中value数组的内容为：");
        System.out.println(whyStringImutable.getValue());
        System.out.println(whyStringImutable.getValue());
    }
}
