package com.morgan.vm;


/**
 * @Description Java栈溢出(虚拟机栈、本地方法栈)-OutOfMemoryError(windows慎用，容易造成系统假死)
 * 启动参数设置：-Xss 128k
 * @Author Morgan
 * @Date 2021/1/4 15:02
 **/
public class JavaVMStackOOM {


    public void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Runnable target;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
//        JavaVMStackOOM oom = new JavaVMStackOOM();
//        oom.stackLeakByThread();
    }
}
