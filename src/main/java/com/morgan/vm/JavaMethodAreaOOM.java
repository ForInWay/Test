package com.morgan.vm;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description Java方法区异常-OutOfMemoryError
 * 启动参数设置：-XX:PermSize:10M -XX:MaxPermSize=10M(1.8被废弃掉了)
 * -XX:MaxMetaspaceSize：设置元数据空间最大值，-1默认不限制
 * -XX:MetaspaceSize:指定元空间的初始大小，达到该值则会触发垃圾收集
 * -XX:MinMetaspaceFreeRatio：用于控制垃圾收集后，最小的元空间剩余容量的百分比，能够用于控制垃圾收集的频率
 * -XX:MaxMetaspaceFreeRatio：用于控制垃圾收集后，最大的空间剩余容量的百分比,能够用于控制垃圾收集的频率
 * @Author Morgan
 * @Date 2021/1/4 15:02
 **/
public class JavaMethodAreaOOM {

    public static void main(String[] args) {
        while (true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o,objects);
                }
            });
            enhancer.create();
        }
    }

    static class OOMObject{

    }
}
