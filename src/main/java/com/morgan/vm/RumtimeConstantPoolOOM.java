package com.morgan.vm;


/**
 * @Description 运行时常量池造成的内存溢出(堆中)-OutOfMemoryError
 * 启动参数设置：-Xss 128k
 * @Author Morgan
 * @Date 2021/1/4 15:02
 **/
public class RumtimeConstantPoolOOM {

    private static int stackLength = 0;

    public void stackLength(){
        stackLength++;
        stackLength();
    }

    public static void main(String[] args) {
        try {
            RumtimeConstantPoolOOM javaVMStackSOF = new RumtimeConstantPoolOOM();
            javaVMStackSOF.stackLength();
        } catch (Throwable e) {
            System.out.println("stack length:" + stackLength);
            e.printStackTrace();
        }
    }
}
