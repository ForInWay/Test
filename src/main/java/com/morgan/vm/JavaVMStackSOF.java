package com.morgan.vm;


/**
 * @Description Java栈溢出(虚拟机栈、本地方法栈)-StackOverFlowError
 * 启动参数设置：-Xss 128k
 * @Author Morgan
 * @Date 2021/1/4 15:02
 **/
public class JavaVMStackSOF {

    private static int stackLength = 0;

    public void stackLength(){
        stackLength++;
        stackLength();
    }

    public static void main(String[] args) {
        try {
            JavaVMStackSOF  javaVMStackSOF = new JavaVMStackSOF();
            javaVMStackSOF.stackLength();
        } catch (Throwable e) {
            System.out.println("stack length:" + stackLength);
            e.printStackTrace();
        }
    }
}
