package com.morgan.untype;

/**
 * @Description 运算测试
 * @Author Morgan
 * @Date 2020/7/30 10:24
 **/
public class CalculationTest {

    public static void main(String[] args) {
        // 位运算
        // 1. ConcurentHashMap的tableSizeFor()
        /*int n = 1073741824 - 1;
        System.out.println("第一个参数：" + Integer.toBinaryString(n) + "\n第二个参数：" + Integer.toBinaryString(n >>> 1));
        n |= n >>> 1;
        System.out.println("结果：" + n);
        System.out.println("第一个参数：" + Integer.toBinaryString(n) + "\n第二个参数：" + Integer.toBinaryString(n >>> 2));
        n |= n >>> 2;
        System.out.println("结果：" + n);
        System.out.println("第一个参数：" + Integer.toBinaryString(n) + "\n第二个参数：" + Integer.toBinaryString(n >>> 4));
        n |= n >>> 4;
        System.out.println("结果：" + n);
        System.out.println("第一个参数：" + Integer.toBinaryString(n) + "\n第二个参数：" + Integer.toBinaryString(n >>> 8));
        n |= n >>> 8;
        System.out.println("结果：" + n);
        System.out.println("第一个参数：" + Integer.toBinaryString(n) + "\n第二个参数：" + Integer.toBinaryString(n >>> 16));
        n |= n >>> 16;
        System.out.println("结果：" + n);*/
        // 2. 无符号右移
        /*int a = 8;
        a = a >>> 2;
        System.out.println(a);*/
        // 测试数组容量大小与实际大小方法
        int[] a = new int[5];
        a[0] = 1;
        System.out.println(a.length);
    }
}
