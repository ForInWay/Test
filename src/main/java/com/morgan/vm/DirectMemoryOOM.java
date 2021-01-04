package com.morgan.vm;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description 直接内存区异常-OutOfMemoryError
 * 启动参数设置：-XX:MaxDirectMemorySize:10M
 * @Author Morgan
 * @Date 2021/1/4 15:02
 **/
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field declaredField = Unsafe.class.getDeclaredFields()[0];
        declaredField.setAccessible(true);
        Unsafe unsafe = (Unsafe)declaredField.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}
