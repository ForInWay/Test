package com.morgan.threadlocal;

/**
 * @Description: 线程A
 * @Author: Morgan
 * @Date: 2020/4/15 11:38
 **/
public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0;i < 2;i++){
                Tools.t1.set("ThreadA " + (i + 1));
                System.out.println("ThreadA getValue:" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
