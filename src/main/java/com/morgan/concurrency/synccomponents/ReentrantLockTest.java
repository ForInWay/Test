package com.morgan.concurrency.synccomponents;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description 可重入锁测试类
 * @Author Morgan
 * @Date 2020/7/14 11:38
 **/
public class ReentrantLockTest {

    private static ReentrantLock lock;
    private volatile static int totalCount = 0;

    static {
        lock = new ReentrantLock(true);
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    lockTest();
                }
            };
            t1.start();
        }
    }

    public static void lockTest(){
        System.out.println("线程名称" + Thread.currentThread().getName() + "获取锁");
        lock.lock();
        try {
            for (int i = 0;i < 10;i++){
                lockTest();
            }
        } finally {
            lock.unlock();
            System.out.println("线程名称" + Thread.currentThread().getName() + "释放锁");
        }
    }
}
