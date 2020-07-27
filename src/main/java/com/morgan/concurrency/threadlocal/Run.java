package com.morgan.concurrency.threadlocal;

/**
 * @Description: 运行类
 * @Author: Morgan
 * @Date: 2020/4/15 12:28
 **/
public class Run {

    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            threadB.start();
            for (int i=0;i < 2;i++){
                Tools.t1.set("Main" + (i + 1));
                System.out.println("Main getValue：" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
