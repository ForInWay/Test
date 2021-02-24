package com.morgan.algorithm;

/**
 * @Description 两数之和
 * @Author Morgan
 * @Date 2021/2/23 18:01
 **/
public class 两数之和 {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] result = twoSum(nums, 6);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i=0; i<length-1; i++){
            for (int j=i+1;j<length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
