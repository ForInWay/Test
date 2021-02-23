package com.morgan.algorithm;

/**
 * @Description 爱生气的书店老板
 * @Author Morgan
 * @Date 2021/2/23 12:00
 **/
public class 爱生气的书店老板 {

    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;
        int count = maxSatisfied(customers, grumpy, X);
        System.out.println(count);
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        // 第一步：先求所有不会生气的时间点的顾客总数
        int length  = customers.length;
        int firstStepTotal = 0;
        for (int i=0; i<length; i++){
            if (grumpy[i] == 0){
                firstStepTotal += customers[i];
            }
        }
        // 第二步：计算X秒窗口内最大的挽留客人数量
        int increase = 0;
        for (int i=0; i<X; i++){
            increase += customers[i] * grumpy[i];
        }
        int maxIncrease = increase;
        for (int i=X; i<length; i++){
            increase = increase - customers[i-X] * grumpy[i-X] + customers[i] * grumpy[i];
            if (increase > maxIncrease){
                maxIncrease = increase;
            }
        }
        return firstStepTotal + maxIncrease;
    }
}
