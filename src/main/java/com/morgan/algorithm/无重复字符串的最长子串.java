package com.morgan.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 无重复字符串的最长子串
 * @Author Morgan
 * @Date 2021/2/24 16:16
 **/
public class 无重复字符串的最长子串 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<length; i++){
            map.put(i,length);
            int left = 0,right = 0;
            for (int j=0; j<length; j++){
                if (chars[i] == chars[j] && j < i){
                    left = i -j;
                }else if(chars[i] == chars[j] && j > i){
                    right = j - i;
                }
                if (right > 0){
                    if (left >= right){
                        map.put(i,left);
                    }else {
                        map.put(i,right);
                    }
                    break;
                }
            }
        }
        int maxLength = 0;
        for (Map.Entry<Integer,Integer> entrys:map.entrySet()){
            Integer value = entrys.getValue();
            if (value > maxLength){
                maxLength = value;
            }
        }
        return maxLength;
    }
}
