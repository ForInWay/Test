package com.morgan.string;

public class WhyStringImutableChild extends WhyStringImutable {

    public char[] value; // 修改字符数组为 public 修饰，不要 final

    public WhyStringImutableChild(String str){
        this.value = str.toCharArray();
    }

    public WhyStringImutableChild() {
        this.value = "".toCharArray();
    }

    @Override
    public char[] getValue() {
        return this.value;
    }
}
