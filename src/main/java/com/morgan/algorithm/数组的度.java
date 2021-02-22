package com.morgan.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description 数组的度
 * @Author Morgan
 * @Date 2021/2/20 17:03
 **/
public class 数组的度 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,2};
        int count = findShortestSubArray(nums);
        System.out.println(count);
    }

    public static int findShortestSubArray(int[] nums){
        Map<Integer, int[]> map = new HashMap<>();
        for (int i=0,length = nums.length; i < length; i++){
            int num = nums[i];
            if (map.containsKey(num)){
                int[] a = map.get(num);
                a[0] = a[0] + 1;
                a[2] = i;
                map.put(num,a);
            }else {
                int[] a = new int[3];
                a[0] = 1;
                a[1] = i;
                a[2] = i;
                map.put(num,a);
            }
        }
        int maxNum = 0,minLength = 0;
        for (Map.Entry<Integer, int[]> entries:map.entrySet()){
            int[] value = entries.getValue();
            if (maxNum < value[0]){
                maxNum = value[0];
                minLength = value[2] - value[1] + 1;
            }else if (maxNum == value[0]){
                if (minLength > (value[2] - value[1] + 1)){
                    minLength = value[2] - value[1] + 1;
                }
            }
        }
        return minLength;
    }
}
