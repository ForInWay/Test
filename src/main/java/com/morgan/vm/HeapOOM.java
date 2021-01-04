package com.morgan.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Java堆溢出
 * 启动参数设置：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Author Morgan
 * @Date 2020/12/31 14:37
 **/
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
