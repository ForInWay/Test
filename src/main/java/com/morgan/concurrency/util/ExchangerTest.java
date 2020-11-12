package com.morgan.concurrency.util;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 线程间数据交换工具
 * @Author Morgan
 * @Date 2020/11/12 15:03
 **/
public class ExchangerTest {

    private final static Exchanger<String> ex = new Exchanger<>();

    private static ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        executor.execute(() -> {
            String A = "银行流水A";
            try {
                String B = ex.exchange(A);
                System.out.println(B);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.execute(() -> {
            try {
                String B = "银行流水B";
                String A = ex.exchange(B);
                System.out.println("A和B的数据是否一致" + A.equals(B) + "A:" + A + ",B:" + B);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }
}
