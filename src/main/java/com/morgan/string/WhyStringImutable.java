package com.morgan.string;

public class WhyStringImutable {
    private final char[] value;

    public WhyStringImutable() {
        this.value = "".toCharArray();
    }

    public WhyStringImutable(String str){
        this.value = str.toCharArray(); // 初始化时转为字符数组
    }

    public char[] getValue(){
        return this.value;
    }
}
