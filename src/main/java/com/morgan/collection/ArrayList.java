package com.morgan.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @Description ArrayList的坑
 * @Author Morgan
 * @Date 2020/5/29 12:04
 **/
public class ArrayList {

    public static void main(String[] args) {
        String a = "For";
        String b = "InWay";
        List<String> list = Arrays.asList(a, b);
        list.add(" Test");
    }
}
